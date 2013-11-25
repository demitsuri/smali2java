package com.litecoding.smali2java;

import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.parser.Parser;
import com.litecoding.smali2java.parser.Rule;
import com.litecoding.smali2java.renderer.ClassRenderer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ecosystem
{
	private static Ecosystem instance = null;

	private Map<String, SmaliClass> classes = new HashMap<String, SmaliClass>();

	protected Ecosystem()
	{

	}

	public static Ecosystem getInstance()
	{
		if (instance == null)
			instance = new Ecosystem();
		return instance;
	}

	public Map<String, SmaliClass> getClasses()
	{
		return classes;
	}

	public void processFile(String src, String dst) throws Exception
	{
		File srcFile = new File(src);

		String smaliSource = readSourceFile(srcFile);

		Rule classrule = Parser.parse("smali", smaliSource);
		SmaliClass smaliClass = (SmaliClass) classrule.accept(new SmaliClassBuilder());
		classes.put(smaliClass.getClassName(), smaliClass);

		String javaSource = ClassRenderer.renderObject(smaliClass);

		printSource(javaSource);
		writeJavaSourceToFile(dst, javaSource);
	}

	private String readSourceFile(File srcFile) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(srcFile));
		char[] buffer = new char[4096];
		int read = 0;
		StringBuilder sb = new StringBuilder();
		while ((read = reader.read(buffer)) > 0)
		{
			sb.append(buffer, 0, read);
		}
		sb.append("\n"); //fix for the bug than .end method ends by EOF but not CRLF
		reader.close();
		return sb.toString();
	}

	private void printSource(String text)
	{
		System.out.println(text);
	}

	private void writeJavaSourceToFile(String dst, String javaSource) throws IOException
	{
		if (dst != null)
		{
			FileWriter writer = new FileWriter(dst);
			writer.write(javaSource);
			writer.close();
		}
	}

}
