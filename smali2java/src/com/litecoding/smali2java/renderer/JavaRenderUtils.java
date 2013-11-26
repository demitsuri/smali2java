package com.litecoding.smali2java.renderer;

public class JavaRenderUtils
{
	public static String renderJavaClassName(String smaliClassName)
	{
		if(smaliClassName == null) 
			return null;
		
		if(smaliClassName.equals("V"))
			return "void";
		
		if(smaliClassName.equals("Z"))
			return "boolean";
		
		if(smaliClassName.equals("B"))
			return "byte";
		
		if(smaliClassName.equals("S"))
			return "short";
		
		if(smaliClassName.equals("C"))
			return "char";
		
		if(smaliClassName.equals("I"))
			return "int";
		
		if(smaliClassName.equals("J"))
			return "long";
		
		if(smaliClassName.equals("F"))
			return "float";
		
		if(smaliClassName.equals("D"))
			return "double";

		String clazzName = smaliClassName.substring(1, smaliClassName.length() - 1).replaceAll("/", ".");
		if ("java.lang.String".equals(clazzName) || "Ljava.lang.String".equals(clazzName))
		{
			clazzName = "String";
		}
		return clazzName;
	}
	
	public static String renderShortJavaClassName(String smaliClassName)
	{
		smaliClassName = renderJavaClassName(smaliClassName);
		
		if(smaliClassName == null) 
			return null;
		
		String[] namePieces = smaliClassName.split("\\."); 
		
		return namePieces[namePieces.length - 1];
	}
	
	public static String renderComplexTypeDeclaration(String smaliType)
	{
		if(smaliType == null)
			return null;
		if(smaliType.startsWith("["))
			return renderComplexTypeDeclaration(smaliType.substring(1)).concat("[]");
		return renderJavaClassName(smaliType);
	}
	
	public static String renderShortComplexTypeDeclaration(String smaliType)
	{
		if(smaliType == null)
			return null;
		if(smaliType.startsWith("["))
			return renderShortComplexTypeDeclaration(smaliType.substring(1)).concat("[]");
		return renderShortJavaClassName(smaliType);
	}
}
