package com.litecoding.smali2java;

import java.util.List;

import com.litecoding.smali2java.entity.smali.ClassRef;
import com.litecoding.smali2java.entity.smali.SmaliCodeEntity;
import com.litecoding.smali2java.entity.smali.EntityFactory;
import com.litecoding.smali2java.entity.smali.MethodRef;
import com.litecoding.smali2java.entity.smali.Param;
import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.litecoding.smali2java.entity.smali.Register;
import com.litecoding.smali2java.entity.smali.RegisterGroup;
import com.litecoding.smali2java.parser.*;

public abstract class BasicSmaliBuilder extends BasicTextBuilder {
	protected SmaliClass smaliClass = null;
	protected SmaliMethod currentMethod = null;

	@Override
	public Object visit(Rule_todoStubLine rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_padding rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_optPadding rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_widePadding rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_optWidePadding rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_listSeparator rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_qualifier rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_className rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_commentSequence rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_comment rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_emptyLine rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_skipLine rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_fileName rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_accessMode rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_interfaceMode rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirClass rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirSuper rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirSource rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirImplements rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirAnnotation rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirEndAnnotation rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirEndSubannotation rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirField rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirEndField rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirMethod rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirSubannotation rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_annotation rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_annotationVisibility rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_annotationBody rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_type rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_boolValue rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_nullValue rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_intValue rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_intDecValue rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_intHexValue rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_strValue rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_value rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirEnd rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirEndMethod rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirRegisters rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirLocal rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_escSymbol rule) {
		return rule.spelling;
	}		

	@Override
	public Object visit(Rule_smaliConstructorName rule) {
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_classConstructorName rule) {
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_label rule) {
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_codeLabel)
				return EntityFactory.createLabel(innerRule.rules.get(1).spelling);
		}
		return null;
	}

	@Override
	public Object visit(Rule_codeRegisterP rule) {
		return generateRegisterFromRule(rule);
	}

	@Override
	public Object visit(Rule_codeRegisterV rule) {		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegister rule) {
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterVDst rule) {		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterP64 rule) {
		return generateRegisterFromRule(rule);
	}

	@Override
	public Object visit(Rule_codeRegisterV64 rule) {		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegister64 rule) {
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterV64Dst rule) {		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterRet rule) {
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterRet64 rule) {
		return generateRegisterFromRule(rule);
	}

	@Override
	public Object visit(Rule_smaliClassRef rule) {
		ClassRef classRef = new ClassRef();
		classRef.setName(rule.rules.get(0).spelling);
		return classRef;
	}
		
	@Override
	public Object visit(Rule_smaliFieldRef rule) {		
		String className = "";
		String name = "";
		String type = "";
		
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_className)
				className = innerRule.spelling;
			else if(innerRule instanceof Rule_qualifier)
				name = innerRule.spelling;
			else if(innerRule instanceof Rule_type) {
				type = innerRule.spelling;
				smaliClass.addImport(type);
			}
		}
		return EntityFactory.createFieldRef(name, className, type);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visit(Rule_smaliMethodRef rule) {
		MethodRef ref = EntityFactory.createCommonMethodRef();
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_className)
				ref.setClassName(innerRule.spelling);
			else if(innerRule instanceof Rule_qualifier)
				ref.setName(innerRule.spelling);
			else if(innerRule instanceof Rule_smaliConstructorName) {
				ref.setName(innerRule.spelling);
				ref.setConstructor(true);
			} else if(innerRule instanceof Rule_classMethodProto) {
				List<Param> protoParams = (List<Param>)innerRule.accept(this);
				ref.setReturnType(protoParams.remove(0).getType());
				smaliClass.addImport(ref.getReturnType());
				for(Param param : protoParams) {
					ref.addParam(param);
					smaliClass.addImport(param.getType());
				}
			}
		}
		return ref;
	}	
	
	@Override
	public Object visit(Rule_codeRegisterGroup rule) {
		RegisterGroup group = new RegisterGroup();
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_codeRegisterV ||
			   innerRule instanceof Rule_codeRegisterP) {
				group.addArgument((SmaliCodeEntity)innerRule.accept(this));
			}
		}
		return group;
	}	

	private Object generateRegisterFromRule(Rule rule) {
		Rule testRule = rule;
		Register register = new Register();
		
		if(rule instanceof Rule_codeRegister || 
				rule instanceof Rule_codeRegister64) {
			testRule = rule.rules.get(0);
		}
		
		if(rule instanceof Rule_codeRegisterRet || 
				rule instanceof Rule_codeRegisterRet64) {
			testRule = rule.rules.get(0);
			register.setType(currentMethod.getReturnType());
			register.info.isFinallyDefined = true;
		}
		
		if(testRule instanceof Rule_codeRegisterP ||
				testRule instanceof Rule_codeRegisterP64)
			register.setParameter(true);
		
		if(testRule instanceof Rule_codeRegisterVDst || 
				testRule instanceof Rule_codeRegisterV64Dst)
			register.setDestination(true);
		
		if(testRule instanceof Rule_codeRegisterP64 ||
				testRule instanceof Rule_codeRegisterV64 || 
				testRule instanceof Rule_codeRegisterV64Dst)
			register.set64bit(true);
		
		register.setName(rule.spelling);
		register.mapRegister(currentMethod);
		
		return register;
	}
	
	
}
