package com.litecoding.smali2java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.litecoding.smali2java.entity.smali.SmaliCodeEntity;
import com.litecoding.smali2java.entity.smali.Param;
import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.entity.smali.SmaliField;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.litecoding.smali2java.parser.*;

public class SmaliClassBuilder extends BasicCommandsBuilder {
	@Override
	public Object visit(Rule_smali rule) {
		smaliClass = new SmaliClass();
		buildClassByRules(rule.rules);
		return smaliClass;
	}

	@Override
	public Object visit(Rule_classHeader rule) {
		buildClassByRules(rule.rules);
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_classClass rule) {
		//fill .class data
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_dirClass)
				continue;
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;
			
			if(innerRule instanceof Rule_accessMode) {
				if(SmaliClass.K_PRIVATE.equals(innerRule.spelling))
					smaliClass.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PRIVATE);
				else if(SmaliClass.K_PROTECTED.equals(innerRule.spelling))
					smaliClass.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PROTECTED);
				else if(SmaliClass.K_PUBLIC.equals(innerRule.spelling))
					smaliClass.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PUBLIC);
				else if(SmaliClass.K_FINAL.equals(innerRule.spelling))
					smaliClass.setFlag(SmaliClass.FINAL);
				else if(SmaliClass.K_ABSTRACT.equals(innerRule.spelling))
					smaliClass.setFlag(SmaliClass.ABSTRACT);
			} else if(innerRule instanceof Rule_interfaceMode) {
				smaliClass.setFlag(SmaliClass.INTERFACE);
			} else if(innerRule instanceof Rule_className) {
				smaliClass.setClassName(innerRule.spelling);				
			}
		}
		
		return rule.spelling;
	}	

	@Override
	public Object visit(Rule_classSuper rule) {
		//fill .super data
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_dirSuper)
				continue;
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;
			
			if(innerRule instanceof Rule_className) {
				smaliClass.setSuperClassName(innerRule.spelling);
				smaliClass.addImport(innerRule.spelling);
			}
		}
		
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_classSource rule) {
		//fill .source data
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_dirClass)
				continue;
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;
			if(innerRule instanceof Terminal_StringValue)
				continue;
			
			if(innerRule instanceof Rule_fileName) {
				smaliClass.setFileName(innerRule.spelling);
			}
		}
		
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_classImplements rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_classField rule) {
		SmaliField field = new SmaliField();
		//fill .field data
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_dirField)
				continue;
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;

			if(innerRule instanceof Rule_accessMode) {
				if(SmaliClass.K_PRIVATE.equals(innerRule.spelling))
					field.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PRIVATE);
				else if(SmaliClass.K_PROTECTED.equals(innerRule.spelling))
					field.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PROTECTED);
				else if(SmaliClass.K_PUBLIC.equals(innerRule.spelling))
					field.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PUBLIC);
				else if(SmaliClass.K_FINAL.equals(innerRule.spelling))
					field.setFlag(SmaliClass.FINAL);
				else if(SmaliClass.K_STATIC.equals(innerRule.spelling))
					field.setFlag(SmaliClass.STATIC);
			} else if(innerRule instanceof Rule_qualifier) {
				field.setName(innerRule.spelling);
			} else if(innerRule instanceof Rule_type) {
				field.setType(innerRule.spelling);
				smaliClass.addImport(innerRule.spelling);
			} else if(innerRule instanceof Rule_value) {
				field.setValue(innerRule.spelling);
			}
		}
		
		smaliClass.addField(field);
		return rule.spelling;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visit(Rule_classMethod rule) {
		currentMethod = new SmaliMethod();
		//fill .field data
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_dirField)
				continue;
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;

			if(innerRule instanceof Rule_accessMode) {
				if(SmaliClass.K_PRIVATE.equals(innerRule.spelling))
					currentMethod.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PRIVATE);
				else if(SmaliClass.K_PROTECTED.equals(innerRule.spelling))
					currentMethod.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PROTECTED);
				else if(SmaliClass.K_PUBLIC.equals(innerRule.spelling))
					currentMethod.setFlagValue(SmaliClass.MASK_ACCESSIBILITY, SmaliClass.PUBLIC);
				else if(SmaliClass.K_FINAL.equals(innerRule.spelling))
					currentMethod.setFlag(SmaliClass.FINAL);
				else if(SmaliClass.K_STATIC.equals(innerRule.spelling))
					currentMethod.setFlag(SmaliClass.STATIC);
			} else if(innerRule instanceof Rule_classConstructorName) {
				currentMethod.setName(smaliClass.getClassName());
				currentMethod.setConstructor(true);
			} else if(innerRule instanceof Rule_qualifier) {
				currentMethod.setName(innerRule.spelling);
				currentMethod.setConstructor(false);
			} else if(innerRule instanceof Rule_classMethodProto) {
				List<Param> protoParams = (List<Param>)innerRule.accept(this);
				currentMethod.setReturnType(protoParams.remove(0).getType());
				for(Param param : protoParams)
					currentMethod.addParam(param);
			} else if(innerRule instanceof Rule_methodBody) {
				innerRule.accept(this);
			}
		}
		
		smaliClass.addMethod(currentMethod);
		
		//always build register mapping here because of probably missing .locals or .registers
		currentMethod.buildRegisterMapping();
		return rule.spelling;
	}

	/**
	 * @param rule
	 * @return a list where first Param identifies return value type. Parameters are listed in their appearance order.
	 */
	@Override
	public Object visit(Rule_classMethodProto rule) {
		List<Param> params = new LinkedList<Param>();
		boolean awaitingReturnType = false;
		for(Rule protoRule : rule.rules) {
			if(protoRule.spelling.equals("("))
				continue;
			
			if(protoRule.spelling.equals(")")) {
				awaitingReturnType = true;
				continue;
			}
			
			if(awaitingReturnType) {
				Param param = new Param(protoRule.spelling);
				params.add(0, param);
			} else {
				Param param = new Param(protoRule.spelling);
				params.add(param);
			}
		}
		return params;
	}


	private void buildClassByRules(ArrayList<Rule> rules) {
		for(Rule rule : rules)
			rule.accept(this);
	}	

	@Override
	public Object visit(Rule_methodBody rule) {
		int currParamNumber = 0;
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_skipLine)
				continue;
			if(innerRule instanceof Rule_methodPrologue)
				continue;
			if(innerRule instanceof Rule_methodLine)
				continue;
			
			if(innerRule instanceof Rule_methodParam) { 
				currentMethod.getParams().get(currParamNumber).setName((String)innerRule.accept(this));
				currParamNumber++;
			} else if(innerRule instanceof Rule_methodLocals) { 
				currentMethod.setLocals((Integer)innerRule.accept(this));
				//rebuild register mapping
				currentMethod.buildRegisterMapping();
			} else if(innerRule instanceof Rule_methodRegisters) { 
				currentMethod.setRegisters((Integer)innerRule.accept(this));
				//rebuild register mapping
				currentMethod.buildRegisterMapping();
			} else if(innerRule instanceof Rule_cmdAny) {
				currentMethod.addCommand((SmaliCodeEntity)innerRule.accept(this));
			} else if(innerRule instanceof Rule_label) {
				currentMethod.addCommand((SmaliCodeEntity)innerRule.accept(this));
			}
		}
		
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_smaliTypeRef rule)
	{
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public Object visit(Rule_methodLocals rule) {		
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_intValue)
				return new Integer(innerRule.spelling);
		}
		return 0;
	}

	@Override
	public Object visit(Rule_methodParam rule) {
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_strValue) {
				String paramName = innerRule.spelling;
				if(paramName.startsWith("\""))
					paramName = paramName.substring(1);
				
				if(paramName.endsWith("\""))
					paramName = paramName.substring(0, paramName.length() - 1);
				
				return paramName;
			}
		}
		return "";
	}

	@Override
	public Object visit(Rule_methodPrologue rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_methodLine rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_methodRegisters rule) {
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_intValue)
				return new Integer(innerRule.spelling);
		}
		return 0;
	}
	
	@Override
	public Object visit(Rule_methodLocal rule) {
		return rule.spelling;
	}
		
}
