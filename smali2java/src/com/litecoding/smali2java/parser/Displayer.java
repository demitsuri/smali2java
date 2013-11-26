/* -----------------------------------------------------------------------------
 * Displayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Tue Nov 26 15:11:46 CET 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

public class Displayer implements Visitor
{

  public Object visit(Rule_padding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_optPadding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_widePadding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_optWidePadding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_listSeparator rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_escSymbol rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_qualifier rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_className rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_commentSequence rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_comment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_emptyLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_skipLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fileName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_accessMode rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_interfaceMode rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_boolValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intDecValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intHexValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_strValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_value rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeLabel rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterP64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterVDst rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV64Dst rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegister rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegister64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterRet rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterRet64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterGroup rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirAnnotation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirClass rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEnd rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndAnnotation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndField rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndSubannotation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirImplements rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirField rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirRegisters rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirSubannotation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirSuper rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirSource rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smali rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_todoStubLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classHeader rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classClass rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classSuper rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classSource rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classImplements rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLocals rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodParam rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodPrologue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodRegisters rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodRestart rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodEndLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodCatch rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_annotation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_annotationVisibility rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_annotationBody rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classField rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classConstructorName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classMethodProto rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodBody rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_label rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliConstructorName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliClassRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliTypeRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliFieldRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliMethodRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HTAB rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_LF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_SP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CRLF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_QUOT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HASH rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_COMMA rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DOT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_COLON rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_SEMICOLON rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_EQ rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_UNDERSCORE rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ALPHA rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DIGIT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HEXDIG rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_VCHAR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAny rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddFloat2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddDouble2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAddLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAndLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAget rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAgetWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAput rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAputWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdArrayLength rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCheckCast rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCmpgDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCmpgFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCmplDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCmplFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdCmpLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConst rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConst16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConst4 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstClass rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstHigh16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstString rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstStringJumbo rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstWide16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstWide32 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstWideHigh16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivFloat2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivDouble2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDivLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDoubleToFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDoubleToInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdDoubleToLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFillArrayData rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFilledNewArray rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFilledNewArrayRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFloatToDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFloatToInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdFloatToLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdGoto rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdGoto16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdGoto32 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfEq rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfEqz rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfGe rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfGez rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfGt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfGtz rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfLe rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfLez rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfLt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfLtz rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfNe rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfNez rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIget rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInstanceOf rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIntToShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeDirect rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeDirectRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeInterface rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeInterfaceRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeStatic rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeStaticRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeSuper rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeSuperRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeVirtual rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeVirtualRange rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIput rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdLongToDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdLongToFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdLongToInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMonitorEnter rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMonitorExit rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMove rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMove16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveException rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveFrom16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveObject16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveObjectFrom16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveResult rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveResultObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveResultWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveWide16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveWideFrom16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulFloat2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulDouble2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMulLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNegDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNegFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNegInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNegLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNewArray rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNewInstance rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNop rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNotInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNotLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdOrLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdPackedSwitch rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemFloat2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemDouble2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRemLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturn rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnVoid rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRsubInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdRsubIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSget rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShlInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShlInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShlIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShlLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShlLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShrInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShrInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShrIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShrLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdShrLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSparseSwitch rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSput rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputBoolean rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputByte rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputChar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputShort rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubFloat rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubFloat2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubDouble rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubDouble2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSubLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdThrow rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdUshrInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdUshrInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdUshrIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdUshrLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdUshrLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorInt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorInt2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorIntLit16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorIntLit8 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorLong rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdXorLong2addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  private Object visitRules(ArrayList<Rule> rules)
  {
    for (Rule rule : rules)
      rule.accept(this);
    return null;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
