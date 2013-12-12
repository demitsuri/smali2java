package com.litecoding.smali2java.renderer;

import com.litecoding.smali2java.entity.java.Comment;
import com.litecoding.smali2java.entity.java.MethodCall;
import com.litecoding.smali2java.entity.java.Renderable;
import com.litecoding.smali2java.entity.java.Variable;
import com.litecoding.smali2java.entity.smali.*;
import com.litecoding.smali2java.renderer.SmaliRenderer.SmaliBlock;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JavaRenderer {
	public static List<Renderable> generateJavaEntities(SmaliMethod smaliMethod) {
		SmaliBlock block = null;
		Comment errorComment = null;
		
		try {
			block = SmaliRenderer.generateBlocks(smaliMethod);
			
			System.out.println("===[BEGIN OF BLOCK CHAIN]===");
			SmaliRenderer.printBlockChain(block);
			System.out.println("===[END OF BLOCK CHAIN]===");
			System.out.println();
		} catch(Exception e) {
			System.out.println("Exception while generating block");
			e.printStackTrace();
			
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			errorComment = new Comment(sw.toString());
		}
		
		List<Renderable> entities = new ArrayList<Renderable>();
		if(errorComment != null) {
			entities.add(errorComment);
			return entities;
		}
		
		if(!block.isPlain()) {
			//for this time we don't support block chains
			entities.add(new Comment("Can't render chain of blocks"));
			return entities;
		}
		
		if(smaliMethod.isConstructor()) {
			entities.addAll(generateConstructor(smaliMethod, block));
			return entities;
		}
		
		entities.add(new Comment("Can't render this method"));
		
		return entities;
	}

	private static Collection<Renderable> generateConstructor(
			SmaliMethod smaliMethod, SmaliBlock rootBlock) {
		List<Renderable> entities = new ArrayList<Renderable>();
		
		SmaliClass smaliClass = smaliMethod.getSmaliClass();
		List<Instruction> instructions = rootBlock.instructions;
		Instruction instruction = instructions.get(0); //TODO: fix for super(CONST, ...)
		List<SmaliCodeEntity> args = instruction.getArguments();
		
		if("invoke-direct".equals(instruction.getOpcodeData().getName())) {
			//maybe this() or super() call
			MethodRef methodRef = (MethodRef) args.get(args.size() - 1);
			
			if(methodRef.isConstructor()) {
				//this is this() or super() call
				MethodCall methodCall = new MethodCall(MethodCall.CALL_DIRECT, 
						methodRef.getClassName(), 
						methodRef.getName());
				Renderable entity = methodCall;
				
				methodCall.setConstructorCall(true);
				if(smaliClass.getSuperClassName().equals(methodRef.getClassName()))
					methodCall.setSuperCall(true);
				else
					methodCall.setThisCall(true);
				
				RegisterGroup regGroup = (RegisterGroup) args.get(0);
				boolean skipElement = true;
				for(SmaliCodeEntity regEntity : regGroup.getArguments()) {
					if(skipElement) {
						skipElement = false;
						continue;
					}
					Variable var = new Variable();
					var.setName(((Register)regEntity).getName());
					methodCall.getParams().add(var);
				}
				
				if(smaliClass.getSuperClassName().equals("Ljava/lang/Object;"))
					entity = new Comment(methodCall.render());
				
				entities.add(entity);
			}
		}
		
		return entities;
	}
}
