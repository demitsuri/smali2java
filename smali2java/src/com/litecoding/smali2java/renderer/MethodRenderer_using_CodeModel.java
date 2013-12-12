package com.litecoding.smali2java.renderer;

import com.litecoding.smali2java.entity.java.CodeModelEnabled;
import com.litecoding.smali2java.entity.java.Renderable;
import com.litecoding.smali2java.entity.smali.Param;
import com.litecoding.smali2java.entity.smali.SmaliEntity;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JType;

import java.util.List;

import static com.litecoding.smali2java.renderer.JavaRenderUtils.renderComplexTypeDeclaration;
import static com.litecoding.smali2java.renderer.JavaRenderer.generateJavaEntities;


public class MethodRenderer_using_CodeModel
{
	private boolean isEgyptianBraces = false;

	public void render(JCodeModel codeModel, JDefinedClass javaClass, JMethod javaMethod, SmaliMethod smaliMethod)
	{
		for (Param param : smaliMethod.getParams())
		{
			int mods = 0;
			JType type = codeModel.directClass(renderComplexTypeDeclaration(param.getType()));
			String name = param.getName();
			javaMethod.param(mods, type, name);
		}

		boolean isInterface = smaliMethod.getSmaliClass().isFlagSet(SmaliEntity.INTERFACE) && smaliMethod.getCommands().size() == 0;

		if (!isInterface)
		{
			for (Renderable entity : generateJavaEntities(smaliMethod))
			{
				if (entity instanceof CodeModelEnabled) {
					((CodeModelEnabled) entity).renderCodeModel(javaMethod);
				}
				String render = entity.render();

				System.out.println(render);
//			builder.append(entity.render());
//			builder.append("\n");
			}
		}

	}

}
