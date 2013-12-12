package com.litecoding.smali2java;

import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.parser.Parser;
import com.litecoding.smali2java.parser.Rule;
import com.litecoding.smali2java.renderer.ClassRenderer;
import com.litecoding.smali2java.renderer.ClassRenderer_using_CodeModel;

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

		// using "old" renderer
		String javaSource = null;
		try
		{
			javaSource = ClassRenderer.renderObject(smaliClass);
			writeJavaSourceToFile(dst, javaSource);
		} catch (IOException e)
		{
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}

		// using "new" renderer, based on CodeModel
		try
		{
			javaSource = new ClassRenderer_using_CodeModel().render(smaliClass);
			writeJavaSourceToFile(dst + "_", javaSource);
		} catch (IOException e)
		{
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
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
