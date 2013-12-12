package com.litecoding.smali2java.renderer;

import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.entity.smali.SmaliEntity;
import com.litecoding.smali2java.entity.smali.SmaliField;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.sun.codemodel.*;
import com.sun.codemodel.writer.SingleStreamCodeWriter;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Modifier;

import static com.litecoding.smali2java.renderer.JavaRenderUtils.*;

public class ClassRenderer_using_CodeModel
{
	public String render(SmaliClass smaliClass)
	{
		try
		{
			JCodeModel codeModel = new JCodeModel();
			JDefinedClass javaClass = codeModel._class(renderShortJavaClassName(smaliClass.getClassName()));

			for (String _import : smaliClass.getImports())
			{
				String _importType = renderShortJavaClassName(_import);
				if (_importType != null && !_importType.isEmpty())
				{
					codeModel.directClass(_importType);
				}
			}

			renderFields(codeModel, javaClass, smaliClass);
			renderMethods(codeModel, javaClass, smaliClass);


			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			SingleStreamCodeWriter codeWriter = new SingleStreamCodeWriter(outputStream);
			codeModel.build(codeWriter);
			return new String(outputStream.toByteArray());
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	private void renderFields(JCodeModel codeModel, JDefinedClass javaClass, SmaliClass smaliClass)
	{
		for (SmaliField smaliField : smaliClass.getFields())
		{

			int mods = transformModifiers(smaliField);
			String typeName = renderJavaClassName(smaliField.getType());
			JType type = codeModel.directClass(typeName);
			String name = smaliField.getName();
			JExpression expression = null;
			String value = smaliField.getValue();
			if ("String".equals(typeName) && value != null)
			{
				expression = JExpr.lit(value);
			}
			if ("int".equals(typeName) && value != null)
			{
				expression = JExpr.direct(value);
			}
			if ("boolean".equals(typeName) && value != null)
			{
				expression = JExpr.direct(value);
			}
			javaClass.field(mods, type, name, expression);
		}
	}

	private void renderMethods(JCodeModel codeModel, JDefinedClass javaClass, SmaliClass smaliClass)
	{
		for (SmaliMethod smaliMethod : smaliClass.getMethods())
		{
			int mods = transformModifiers(smaliMethod);
			String typeName = renderShortComplexTypeDeclaration(smaliMethod.getReturnType());
			JType returnType = codeModel.directClass(typeName);
			String name = smaliMethod.getName();
			if (smaliMethod.isConstructor())
			{
				// constructors
				returnType = null;
				name = renderShortJavaClassName(smaliClass.getClassName());
			}
			JMethod javaMethod = javaClass.method(mods, returnType, name);
			new MethodRenderer_using_CodeModel().render(codeModel, javaClass, javaMethod, smaliMethod);
		}
	}

	private int transformModifiers(SmaliEntity smaliEntity)
	{
		int mods = 0;
		switch (smaliEntity.getFlagValue(SmaliEntity.MASK_ACCESSIBILITY))
		{
			case SmaliEntity.PUBLIC:
			{
				mods |= Modifier.PUBLIC;
				break;
			}
			case SmaliEntity.PROTECTED:
			{
				mods |= Modifier.PROTECTED;
				break;
			}
			case SmaliEntity.PRIVATE:
			{
				mods |= Modifier.PRIVATE;
				break;
			}
			default:
			{
				break;
			}
		}

		if (smaliEntity.isFlagSet(SmaliEntity.STATIC))
		{
			mods |= Modifier.STATIC;
		}

		if (smaliEntity.isFlagSet(SmaliEntity.FINAL))
		{
			mods |= Modifier.FINAL;
		}
		if (smaliEntity.isFlagSet(SmaliEntity.ABSTRACT))
		{
			mods |= Modifier.ABSTRACT;
		}
		return mods;
	}

}
