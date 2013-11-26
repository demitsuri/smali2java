package com.litecoding.smali2java.entity.java;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JMethod;

public class Comment implements Renderable, CodeModelEnabled
{
	protected String mComment = "";

	public Comment()
	{
		this("");
	}

	public Comment(String message)
	{
		this.mComment = message;
	}

	public String getComment()
	{
		return mComment;
	}

	public void setComment(String message)
	{
		if (message == null)
			mComment = "";
		else mComment = message;
	}

	@Override
	public String render()
	{
		boolean multiline = false;
		StringBuilder builder = new StringBuilder();

		if (mComment.contains("\n"))
			multiline = true;

		if (multiline)
			builder.append("/* ");
		else
			builder.append("// ");

		builder.append(mComment);

		if (multiline)
			builder.append("\n*/");

		return builder.toString();
	}

	@Override
	public void renderCodeModel(JMethod javaMethod)
	{
		javaMethod.body().directStatement(render());
	}
}
