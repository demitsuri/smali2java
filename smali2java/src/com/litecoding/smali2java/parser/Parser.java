/* -----------------------------------------------------------------------------
 * Parser.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Tue Nov 26 17:33:59 CET 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.Stack;
import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

public class Parser
{
  private Parser() {}

  static public void main(String[] args)
  {
    Properties arguments = new Properties();
    String error = "";
    boolean ok = args.length > 0;

    if (ok)
    {
      arguments.setProperty("Trace", "Off");
      arguments.setProperty("Rule", "padding");

      for (int i = 0; i < args.length; i++)
      {
        if (args[i].equals("-trace"))
          arguments.setProperty("Trace", "On");
        else if (args[i].equals("-visitor"))
          arguments.setProperty("Visitor", args[++i]);
        else if (args[i].equals("-file"))
          arguments.setProperty("File", args[++i]);
        else if (args[i].equals("-string"))
          arguments.setProperty("String", args[++i]);
        else if (args[i].equals("-rule"))
          arguments.setProperty("Rule", args[++i]);
        else
        {
          error = "unknown argument: " + args[i];
          ok = false;
        }
      }
    }

    if (ok)
    {
      if (arguments.getProperty("File") == null &&
          arguments.getProperty("String") == null)
      {
        error = "insufficient arguments: -file or -string required";
        ok = false;
      }
    }

    if (!ok)
    {
      System.out.println("error: " + error);
      System.out.println("usage: Parser [-rule rulename] [-trace] <-file file | -string string> [-visitor visitor]");
    }
    else
    {
      try
      {
        Rule rule = null;

        if (arguments.getProperty("File") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              new File(arguments.getProperty("File")), 
              arguments.getProperty("Trace").equals("On"));
        }
        else if (arguments.getProperty("String") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              arguments.getProperty("String"), 
              arguments.getProperty("Trace").equals("On"));
        }

        if (arguments.getProperty("Visitor") != null)
        {
          Visitor visitor = 
            (Visitor)Class.forName(arguments.getProperty("Visitor")).newInstance();
          rule.accept(visitor);
        }
      }
      catch (IllegalArgumentException e)
      {
        System.out.println("argument error: " + e.getMessage());
      }
      catch (IOException e)
      {
        System.out.println("io error: " + e.getMessage());
      }
      catch (ParserException e)
      {
        System.out.println("parser error: " + e.getMessage());
      }
      catch (ClassNotFoundException e)
      {
        System.out.println("visitor error: class not found - " + e.getMessage());
      }
      catch (IllegalAccessException e)
      {
        System.out.println("visitor error: illegal access - " + e.getMessage());
      }
      catch (InstantiationException e)
      {
        System.out.println("visitor error: instantiation failure - " + e.getMessage());
      }
    }
  }

  static public Rule parse(String rulename, String string)
  throws IllegalArgumentException,
         ParserException
  {
    return parse(rulename, string, false);
  }

  static public Rule parse(String rulename, InputStream in)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, in, false);
  }

  static public Rule parse(String rulename, File file)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, file, false);
  }

  static private Rule parse(String rulename, String string, boolean trace)
  throws IllegalArgumentException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (string == null)
      throw new IllegalArgumentException("null string");

    ParserContext context = new ParserContext(string, trace);

    Rule rule = null;
    if (rulename.equalsIgnoreCase("padding")) rule = Rule_padding.parse(context);
    else if (rulename.equalsIgnoreCase("optPadding")) rule = Rule_optPadding.parse(context);
    else if (rulename.equalsIgnoreCase("widePadding")) rule = Rule_widePadding.parse(context);
    else if (rulename.equalsIgnoreCase("optWidePadding")) rule = Rule_optWidePadding.parse(context);
    else if (rulename.equalsIgnoreCase("listSeparator")) rule = Rule_listSeparator.parse(context);
    else if (rulename.equalsIgnoreCase("escSymbol")) rule = Rule_escSymbol.parse(context);
    else if (rulename.equalsIgnoreCase("qualifier")) rule = Rule_qualifier.parse(context);
    else if (rulename.equalsIgnoreCase("className")) rule = Rule_className.parse(context);
    else if (rulename.equalsIgnoreCase("commentSequence")) rule = Rule_commentSequence.parse(context);
    else if (rulename.equalsIgnoreCase("comment")) rule = Rule_comment.parse(context);
    else if (rulename.equalsIgnoreCase("emptyLine")) rule = Rule_emptyLine.parse(context);
    else if (rulename.equalsIgnoreCase("skipLine")) rule = Rule_skipLine.parse(context);
    else if (rulename.equalsIgnoreCase("fileName")) rule = Rule_fileName.parse(context);
    else if (rulename.equalsIgnoreCase("accessMode")) rule = Rule_accessMode.parse(context);
    else if (rulename.equalsIgnoreCase("interfaceMode")) rule = Rule_interfaceMode.parse(context);
    else if (rulename.equalsIgnoreCase("type")) rule = Rule_type.parse(context);
    else if (rulename.equalsIgnoreCase("boolValue")) rule = Rule_boolValue.parse(context);
    else if (rulename.equalsIgnoreCase("nullValue")) rule = Rule_nullValue.parse(context);
    else if (rulename.equalsIgnoreCase("intDecValue")) rule = Rule_intDecValue.parse(context);
    else if (rulename.equalsIgnoreCase("intHexValue")) rule = Rule_intHexValue.parse(context);
    else if (rulename.equalsIgnoreCase("intValue")) rule = Rule_intValue.parse(context);
    else if (rulename.equalsIgnoreCase("strValue")) rule = Rule_strValue.parse(context);
    else if (rulename.equalsIgnoreCase("value")) rule = Rule_value.parse(context);
    else if (rulename.equalsIgnoreCase("codeLabel")) rule = Rule_codeLabel.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterP")) rule = Rule_codeRegisterP.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterP64")) rule = Rule_codeRegisterP64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV")) rule = Rule_codeRegisterV.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV64")) rule = Rule_codeRegisterV64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterVDst")) rule = Rule_codeRegisterVDst.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV64Dst")) rule = Rule_codeRegisterV64Dst.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegister")) rule = Rule_codeRegister.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegister64")) rule = Rule_codeRegister64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterRet")) rule = Rule_codeRegisterRet.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterRet64")) rule = Rule_codeRegisterRet64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterGroup")) rule = Rule_codeRegisterGroup.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterRange")) rule = Rule_codeRegisterRange.parse(context);
    else if (rulename.equalsIgnoreCase("dirAnnotation")) rule = Rule_dirAnnotation.parse(context);
    else if (rulename.equalsIgnoreCase("dirClass")) rule = Rule_dirClass.parse(context);
    else if (rulename.equalsIgnoreCase("dirEnd")) rule = Rule_dirEnd.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndAnnotation")) rule = Rule_dirEndAnnotation.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndField")) rule = Rule_dirEndField.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndLocal")) rule = Rule_dirEndLocal.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndMethod")) rule = Rule_dirEndMethod.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndPackedSwitch")) rule = Rule_dirEndPackedSwitch.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndSubannotation")) rule = Rule_dirEndSubannotation.parse(context);
    else if (rulename.equalsIgnoreCase("dirImplements")) rule = Rule_dirImplements.parse(context);
    else if (rulename.equalsIgnoreCase("dirField")) rule = Rule_dirField.parse(context);
    else if (rulename.equalsIgnoreCase("dirLocal")) rule = Rule_dirLocal.parse(context);
    else if (rulename.equalsIgnoreCase("dirMethod")) rule = Rule_dirMethod.parse(context);
    else if (rulename.equalsIgnoreCase("dirPackedSwitch")) rule = Rule_dirPackedSwitch.parse(context);
    else if (rulename.equalsIgnoreCase("dirRegisters")) rule = Rule_dirRegisters.parse(context);
    else if (rulename.equalsIgnoreCase("dirSubannotation")) rule = Rule_dirSubannotation.parse(context);
    else if (rulename.equalsIgnoreCase("dirSuper")) rule = Rule_dirSuper.parse(context);
    else if (rulename.equalsIgnoreCase("dirSource")) rule = Rule_dirSource.parse(context);
    else if (rulename.equalsIgnoreCase("smali")) rule = Rule_smali.parse(context);
    else if (rulename.equalsIgnoreCase("todoStubLine")) rule = Rule_todoStubLine.parse(context);
    else if (rulename.equalsIgnoreCase("classHeader")) rule = Rule_classHeader.parse(context);
    else if (rulename.equalsIgnoreCase("classClass")) rule = Rule_classClass.parse(context);
    else if (rulename.equalsIgnoreCase("classSuper")) rule = Rule_classSuper.parse(context);
    else if (rulename.equalsIgnoreCase("classSource")) rule = Rule_classSource.parse(context);
    else if (rulename.equalsIgnoreCase("classImplements")) rule = Rule_classImplements.parse(context);
    else if (rulename.equalsIgnoreCase("methodLocals")) rule = Rule_methodLocals.parse(context);
    else if (rulename.equalsIgnoreCase("methodParam")) rule = Rule_methodParam.parse(context);
    else if (rulename.equalsIgnoreCase("methodPrologue")) rule = Rule_methodPrologue.parse(context);
    else if (rulename.equalsIgnoreCase("methodLine")) rule = Rule_methodLine.parse(context);
    else if (rulename.equalsIgnoreCase("methodRegisters")) rule = Rule_methodRegisters.parse(context);
    else if (rulename.equalsIgnoreCase("methodLocal")) rule = Rule_methodLocal.parse(context);
    else if (rulename.equalsIgnoreCase("methodRestart")) rule = Rule_methodRestart.parse(context);
    else if (rulename.equalsIgnoreCase("methodEndLocal")) rule = Rule_methodEndLocal.parse(context);
    else if (rulename.equalsIgnoreCase("methodCatch")) rule = Rule_methodCatch.parse(context);
    else if (rulename.equalsIgnoreCase("methodCatchAll")) rule = Rule_methodCatchAll.parse(context);
    else if (rulename.equalsIgnoreCase("annotation")) rule = Rule_annotation.parse(context);
    else if (rulename.equalsIgnoreCase("annotationVisibility")) rule = Rule_annotationVisibility.parse(context);
    else if (rulename.equalsIgnoreCase("annotationBody")) rule = Rule_annotationBody.parse(context);
    else if (rulename.equalsIgnoreCase("typesGroup")) rule = Rule_typesGroup.parse(context);
    else if (rulename.equalsIgnoreCase("enclosingMethodType")) rule = Rule_enclosingMethodType.parse(context);
    else if (rulename.equalsIgnoreCase("methodPackedSwitch")) rule = Rule_methodPackedSwitch.parse(context);
    else if (rulename.equalsIgnoreCase("methodPackedSwitchBody")) rule = Rule_methodPackedSwitchBody.parse(context);
    else if (rulename.equalsIgnoreCase("classField")) rule = Rule_classField.parse(context);
    else if (rulename.equalsIgnoreCase("classMethod")) rule = Rule_classMethod.parse(context);
    else if (rulename.equalsIgnoreCase("classConstructorName")) rule = Rule_classConstructorName.parse(context);
    else if (rulename.equalsIgnoreCase("classMethodProto")) rule = Rule_classMethodProto.parse(context);
    else if (rulename.equalsIgnoreCase("methodBody")) rule = Rule_methodBody.parse(context);
    else if (rulename.equalsIgnoreCase("label")) rule = Rule_label.parse(context);
    else if (rulename.equalsIgnoreCase("smaliConstructorName")) rule = Rule_smaliConstructorName.parse(context);
    else if (rulename.equalsIgnoreCase("smaliClassRef")) rule = Rule_smaliClassRef.parse(context);
    else if (rulename.equalsIgnoreCase("smaliTypeRef")) rule = Rule_smaliTypeRef.parse(context);
    else if (rulename.equalsIgnoreCase("smaliFieldRef")) rule = Rule_smaliFieldRef.parse(context);
    else if (rulename.equalsIgnoreCase("smaliMethodRef")) rule = Rule_smaliMethodRef.parse(context);
    else if (rulename.equalsIgnoreCase("HTAB")) rule = Rule_HTAB.parse(context);
    else if (rulename.equalsIgnoreCase("CR")) rule = Rule_CR.parse(context);
    else if (rulename.equalsIgnoreCase("LF")) rule = Rule_LF.parse(context);
    else if (rulename.equalsIgnoreCase("SP")) rule = Rule_SP.parse(context);
    else if (rulename.equalsIgnoreCase("CRLF")) rule = Rule_CRLF.parse(context);
    else if (rulename.equalsIgnoreCase("QUOT")) rule = Rule_QUOT.parse(context);
    else if (rulename.equalsIgnoreCase("HASH")) rule = Rule_HASH.parse(context);
    else if (rulename.equalsIgnoreCase("COMMA")) rule = Rule_COMMA.parse(context);
    else if (rulename.equalsIgnoreCase("DOT")) rule = Rule_DOT.parse(context);
    else if (rulename.equalsIgnoreCase("COLON")) rule = Rule_COLON.parse(context);
    else if (rulename.equalsIgnoreCase("SEMICOLON")) rule = Rule_SEMICOLON.parse(context);
    else if (rulename.equalsIgnoreCase("EQ")) rule = Rule_EQ.parse(context);
    else if (rulename.equalsIgnoreCase("UNDERSCORE")) rule = Rule_UNDERSCORE.parse(context);
    else if (rulename.equalsIgnoreCase("ALPHA")) rule = Rule_ALPHA.parse(context);
    else if (rulename.equalsIgnoreCase("DIGIT")) rule = Rule_DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("HEXDIG")) rule = Rule_HEXDIG.parse(context);
    else if (rulename.equalsIgnoreCase("VCHAR")) rule = Rule_VCHAR.parse(context);
    else if (rulename.equalsIgnoreCase("DOLLAR")) rule = Rule_DOLLAR.parse(context);
    else if (rulename.equalsIgnoreCase("PARENTHESES_OPEN")) rule = Rule_PARENTHESES_OPEN.parse(context);
    else if (rulename.equalsIgnoreCase("PARENTHESES_CLOSE")) rule = Rule_PARENTHESES_CLOSE.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAny")) rule = Rule_cmdAny.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddFloat")) rule = Rule_cmdAddFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddFloat2addr")) rule = Rule_cmdAddFloat2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddDouble")) rule = Rule_cmdAddDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddDouble2addr")) rule = Rule_cmdAddDouble2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddInt")) rule = Rule_cmdAddInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddInt2addr")) rule = Rule_cmdAddInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddIntLit16")) rule = Rule_cmdAddIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddIntLit8")) rule = Rule_cmdAddIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddLong")) rule = Rule_cmdAddLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAddLong2addr")) rule = Rule_cmdAddLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndInt")) rule = Rule_cmdAndInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndInt2addr")) rule = Rule_cmdAndInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndIntLit16")) rule = Rule_cmdAndIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndIntLit8")) rule = Rule_cmdAndIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndLong")) rule = Rule_cmdAndLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAndLong2addr")) rule = Rule_cmdAndLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAget")) rule = Rule_cmdAget.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetBoolean")) rule = Rule_cmdAgetBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetByte")) rule = Rule_cmdAgetByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetChar")) rule = Rule_cmdAgetChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetObject")) rule = Rule_cmdAgetObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetShort")) rule = Rule_cmdAgetShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAgetWide")) rule = Rule_cmdAgetWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAput")) rule = Rule_cmdAput.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputBoolean")) rule = Rule_cmdAputBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputByte")) rule = Rule_cmdAputByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputChar")) rule = Rule_cmdAputChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputObject")) rule = Rule_cmdAputObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputShort")) rule = Rule_cmdAputShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAputWide")) rule = Rule_cmdAputWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdArrayLength")) rule = Rule_cmdArrayLength.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCheckCast")) rule = Rule_cmdCheckCast.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCmpgDouble")) rule = Rule_cmdCmpgDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCmpgFloat")) rule = Rule_cmdCmpgFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCmplDouble")) rule = Rule_cmdCmplDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCmplFloat")) rule = Rule_cmdCmplFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdCmpLong")) rule = Rule_cmdCmpLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConst")) rule = Rule_cmdConst.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConst16")) rule = Rule_cmdConst16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConst4")) rule = Rule_cmdConst4.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstClass")) rule = Rule_cmdConstClass.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstHigh16")) rule = Rule_cmdConstHigh16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstString")) rule = Rule_cmdConstString.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstStringJumbo")) rule = Rule_cmdConstStringJumbo.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstWide")) rule = Rule_cmdConstWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstWide16")) rule = Rule_cmdConstWide16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstWide32")) rule = Rule_cmdConstWide32.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstWideHigh16")) rule = Rule_cmdConstWideHigh16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivFloat")) rule = Rule_cmdDivFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivFloat2addr")) rule = Rule_cmdDivFloat2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivDouble")) rule = Rule_cmdDivDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivDouble2addr")) rule = Rule_cmdDivDouble2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivInt")) rule = Rule_cmdDivInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivInt2addr")) rule = Rule_cmdDivInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivIntLit16")) rule = Rule_cmdDivIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivIntLit8")) rule = Rule_cmdDivIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivLong")) rule = Rule_cmdDivLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDivLong2addr")) rule = Rule_cmdDivLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDoubleToFloat")) rule = Rule_cmdDoubleToFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDoubleToInt")) rule = Rule_cmdDoubleToInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdDoubleToLong")) rule = Rule_cmdDoubleToLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFillArrayData")) rule = Rule_cmdFillArrayData.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFilledNewArray")) rule = Rule_cmdFilledNewArray.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFilledNewArrayRange")) rule = Rule_cmdFilledNewArrayRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFloatToDouble")) rule = Rule_cmdFloatToDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFloatToInt")) rule = Rule_cmdFloatToInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdFloatToLong")) rule = Rule_cmdFloatToLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdGoto")) rule = Rule_cmdGoto.parse(context);
    else if (rulename.equalsIgnoreCase("cmdGoto16")) rule = Rule_cmdGoto16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdGoto32")) rule = Rule_cmdGoto32.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfEq")) rule = Rule_cmdIfEq.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfEqz")) rule = Rule_cmdIfEqz.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfGe")) rule = Rule_cmdIfGe.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfGez")) rule = Rule_cmdIfGez.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfGt")) rule = Rule_cmdIfGt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfGtz")) rule = Rule_cmdIfGtz.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfLe")) rule = Rule_cmdIfLe.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfLez")) rule = Rule_cmdIfLez.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfLt")) rule = Rule_cmdIfLt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfLtz")) rule = Rule_cmdIfLtz.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfNe")) rule = Rule_cmdIfNe.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfNez")) rule = Rule_cmdIfNez.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIget")) rule = Rule_cmdIget.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetBoolean")) rule = Rule_cmdIgetBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetByte")) rule = Rule_cmdIgetByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetChar")) rule = Rule_cmdIgetChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetObject")) rule = Rule_cmdIgetObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetShort")) rule = Rule_cmdIgetShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetWide")) rule = Rule_cmdIgetWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInstanceOf")) rule = Rule_cmdInstanceOf.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToByte")) rule = Rule_cmdIntToByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToChar")) rule = Rule_cmdIntToChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToDouble")) rule = Rule_cmdIntToDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToFloat")) rule = Rule_cmdIntToFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToLong")) rule = Rule_cmdIntToLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIntToShort")) rule = Rule_cmdIntToShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeDirect")) rule = Rule_cmdInvokeDirect.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeDirectRange")) rule = Rule_cmdInvokeDirectRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeInterface")) rule = Rule_cmdInvokeInterface.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeInterfaceRange")) rule = Rule_cmdInvokeInterfaceRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeStatic")) rule = Rule_cmdInvokeStatic.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeStaticRange")) rule = Rule_cmdInvokeStaticRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeSuper")) rule = Rule_cmdInvokeSuper.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeSuperRange")) rule = Rule_cmdInvokeSuperRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeVirtual")) rule = Rule_cmdInvokeVirtual.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeVirtualRange")) rule = Rule_cmdInvokeVirtualRange.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIput")) rule = Rule_cmdIput.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputBoolean")) rule = Rule_cmdIputBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputByte")) rule = Rule_cmdIputByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputChar")) rule = Rule_cmdIputChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputObject")) rule = Rule_cmdIputObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputShort")) rule = Rule_cmdIputShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputWide")) rule = Rule_cmdIputWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdLongToDouble")) rule = Rule_cmdLongToDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdLongToFloat")) rule = Rule_cmdLongToFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdLongToInt")) rule = Rule_cmdLongToInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMonitorEnter")) rule = Rule_cmdMonitorEnter.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMonitorExit")) rule = Rule_cmdMonitorExit.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMove")) rule = Rule_cmdMove.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMove16")) rule = Rule_cmdMove16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveException")) rule = Rule_cmdMoveException.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveFrom16")) rule = Rule_cmdMoveFrom16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveObject")) rule = Rule_cmdMoveObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveObject16")) rule = Rule_cmdMoveObject16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveObjectFrom16")) rule = Rule_cmdMoveObjectFrom16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveResult")) rule = Rule_cmdMoveResult.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveResultObject")) rule = Rule_cmdMoveResultObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveResultWide")) rule = Rule_cmdMoveResultWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveWide")) rule = Rule_cmdMoveWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveWide16")) rule = Rule_cmdMoveWide16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveWideFrom16")) rule = Rule_cmdMoveWideFrom16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulFloat")) rule = Rule_cmdMulFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulFloat2addr")) rule = Rule_cmdMulFloat2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulDouble")) rule = Rule_cmdMulDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulDouble2addr")) rule = Rule_cmdMulDouble2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulInt")) rule = Rule_cmdMulInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulInt2addr")) rule = Rule_cmdMulInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulIntLit16")) rule = Rule_cmdMulIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulIntLit8")) rule = Rule_cmdMulIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulLong")) rule = Rule_cmdMulLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMulLong2addr")) rule = Rule_cmdMulLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNegDouble")) rule = Rule_cmdNegDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNegFloat")) rule = Rule_cmdNegFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNegInt")) rule = Rule_cmdNegInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNegLong")) rule = Rule_cmdNegLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNewArray")) rule = Rule_cmdNewArray.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNewInstance")) rule = Rule_cmdNewInstance.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNop")) rule = Rule_cmdNop.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNotInt")) rule = Rule_cmdNotInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNotLong")) rule = Rule_cmdNotLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrInt")) rule = Rule_cmdOrInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrInt2addr")) rule = Rule_cmdOrInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrIntLit16")) rule = Rule_cmdOrIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrIntLit8")) rule = Rule_cmdOrIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrLong")) rule = Rule_cmdOrLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdOrLong2addr")) rule = Rule_cmdOrLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdPackedSwitch")) rule = Rule_cmdPackedSwitch.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemFloat")) rule = Rule_cmdRemFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemFloat2addr")) rule = Rule_cmdRemFloat2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemDouble")) rule = Rule_cmdRemDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemDouble2addr")) rule = Rule_cmdRemDouble2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemInt")) rule = Rule_cmdRemInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemInt2addr")) rule = Rule_cmdRemInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemIntLit16")) rule = Rule_cmdRemIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemIntLit8")) rule = Rule_cmdRemIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemLong")) rule = Rule_cmdRemLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRemLong2addr")) rule = Rule_cmdRemLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturn")) rule = Rule_cmdReturn.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnObject")) rule = Rule_cmdReturnObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnVoid")) rule = Rule_cmdReturnVoid.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnWide")) rule = Rule_cmdReturnWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRsubInt")) rule = Rule_cmdRsubInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdRsubIntLit8")) rule = Rule_cmdRsubIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSget")) rule = Rule_cmdSget.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetBoolean")) rule = Rule_cmdSgetBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetByte")) rule = Rule_cmdSgetByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetChar")) rule = Rule_cmdSgetChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetObject")) rule = Rule_cmdSgetObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetShort")) rule = Rule_cmdSgetShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSgetWide")) rule = Rule_cmdSgetWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShlInt")) rule = Rule_cmdShlInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShlInt2addr")) rule = Rule_cmdShlInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShlIntLit8")) rule = Rule_cmdShlIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShlLong")) rule = Rule_cmdShlLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShlLong2addr")) rule = Rule_cmdShlLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShrInt")) rule = Rule_cmdShrInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShrInt2addr")) rule = Rule_cmdShrInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShrIntLit8")) rule = Rule_cmdShrIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShrLong")) rule = Rule_cmdShrLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdShrLong2addr")) rule = Rule_cmdShrLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSparseSwitch")) rule = Rule_cmdSparseSwitch.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSput")) rule = Rule_cmdSput.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputBoolean")) rule = Rule_cmdSputBoolean.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputByte")) rule = Rule_cmdSputByte.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputChar")) rule = Rule_cmdSputChar.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputObject")) rule = Rule_cmdSputObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputShort")) rule = Rule_cmdSputShort.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputWide")) rule = Rule_cmdSputWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubFloat")) rule = Rule_cmdSubFloat.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubFloat2addr")) rule = Rule_cmdSubFloat2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubDouble")) rule = Rule_cmdSubDouble.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubDouble2addr")) rule = Rule_cmdSubDouble2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubInt")) rule = Rule_cmdSubInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubInt2addr")) rule = Rule_cmdSubInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubLong")) rule = Rule_cmdSubLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSubLong2addr")) rule = Rule_cmdSubLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdThrow")) rule = Rule_cmdThrow.parse(context);
    else if (rulename.equalsIgnoreCase("cmdUshrInt")) rule = Rule_cmdUshrInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdUshrInt2addr")) rule = Rule_cmdUshrInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdUshrIntLit8")) rule = Rule_cmdUshrIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdUshrLong")) rule = Rule_cmdUshrLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdUshrLong2addr")) rule = Rule_cmdUshrLong2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorInt")) rule = Rule_cmdXorInt.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorInt2addr")) rule = Rule_cmdXorInt2addr.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorIntLit16")) rule = Rule_cmdXorIntLit16.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorIntLit8")) rule = Rule_cmdXorIntLit8.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorLong")) rule = Rule_cmdXorLong.parse(context);
    else if (rulename.equalsIgnoreCase("cmdXorLong2addr")) rule = Rule_cmdXorLong2addr.parse(context);
    else throw new IllegalArgumentException("unknown rule");

    if (rule == null)
    {
      throw new ParserException(
        "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
        context.text,
        context.getErrorIndex(),
        context.getErrorStack());
    }

    if (context.text.length() > context.index)
    {
      ParserException primaryError = 
        new ParserException(
          "extra data found",
          context.text,
          context.index,
          new Stack<String>());

      if (context.getErrorIndex() > context.index)
      {
        ParserException secondaryError = 
          new ParserException(
            "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
            context.text,
            context.getErrorIndex(),
            context.getErrorStack());

        primaryError.initCause(secondaryError);
      }

      throw primaryError;
    }

    return rule;
  }

  static private Rule parse(String rulename, InputStream in, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (in == null)
      throw new IllegalArgumentException("null input stream");

    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    return parse(rulename, out.toString(), trace);
  }

  static private Rule parse(String rulename, File file, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (file == null)
      throw new IllegalArgumentException("null file");

    BufferedReader in = new BufferedReader(new FileReader(file));
    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    in.close();

    return parse(rulename, out.toString(), trace);
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
