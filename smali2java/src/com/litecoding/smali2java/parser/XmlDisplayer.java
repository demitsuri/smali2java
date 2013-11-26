/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Tue Nov 26 17:25:44 CET 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

public class XmlDisplayer implements Visitor
{
  private boolean terminal = true;

  public Object visit(Rule_padding rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<padding>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</padding>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_optPadding rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<optPadding>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</optPadding>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_widePadding rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<widePadding>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</widePadding>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_optWidePadding rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<optWidePadding>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</optWidePadding>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_listSeparator rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<listSeparator>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</listSeparator>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_escSymbol rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<escSymbol>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</escSymbol>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_qualifier rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qualifier>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qualifier>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_className rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<className>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</className>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_commentSequence rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<commentSequence>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</commentSequence>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_emptyLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<emptyLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</emptyLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_skipLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<skipLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</skipLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fileName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fileName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fileName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_accessMode rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<accessMode>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</accessMode>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_interfaceMode rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<interfaceMode>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</interfaceMode>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_boolValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<boolValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</boolValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intDecValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intDecValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intDecValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intHexValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intHexValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intHexValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_strValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<strValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</strValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeLabel rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeLabel>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeLabel>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterP64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterP64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterP64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterV rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterV>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterV>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterV64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterV64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterV64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterVDst rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterVDst>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterVDst>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterV64Dst rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterV64Dst>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterV64Dst>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegister rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegister>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegister>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegister64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegister64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegister64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterRet rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterRet>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterRet>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterRet64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterRet64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterRet64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterGroup rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterGroup>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterGroup>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirAnnotation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirAnnotation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirAnnotation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirClass rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirClass>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirClass>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEnd rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEnd>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEnd>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndAnnotation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndAnnotation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndAnnotation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndField rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndField>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndField>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndPackedSwitch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndPackedSwitch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndPackedSwitch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndSubannotation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndSubannotation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndSubannotation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirImplements rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirImplements>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirImplements>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirField rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirField>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirField>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirPackedSwitch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirPackedSwitch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirPackedSwitch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirRegisters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirRegisters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirRegisters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirSubannotation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirSubannotation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirSubannotation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirSuper rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirSuper>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirSuper>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirSource rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirSource>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirSource>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smali rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smali>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smali>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_todoStubLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<todoStubLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</todoStubLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classHeader>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classClass rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classClass>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classClass>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classSuper rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classSuper>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classSuper>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classSource rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classSource>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classSource>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classImplements rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classImplements>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classImplements>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLocals rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLocals>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLocals>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodParam rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodParam>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodParam>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodPrologue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodPrologue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodPrologue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodRegisters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodRegisters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodRegisters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodRestart rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodRestart>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodRestart>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodEndLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodEndLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodEndLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodCatch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodCatch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodCatch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodCatchAll rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodCatchAll>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodCatchAll>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_annotation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<annotation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</annotation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_annotationVisibility rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<annotationVisibility>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</annotationVisibility>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_annotationBody rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<annotationBody>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</annotationBody>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_typesGroup rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<typesGroup>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</typesGroup>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_enclosingMethodType rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<enclosingMethodType>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</enclosingMethodType>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodPackedSwitch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodPackedSwitch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodPackedSwitch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodPackedSwitchBody rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodPackedSwitchBody>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodPackedSwitchBody>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classField rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classField>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classField>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classConstructorName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classConstructorName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classConstructorName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classMethodProto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classMethodProto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classMethodProto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodBody rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodBody>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodBody>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_label rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<label>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</label>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliConstructorName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliConstructorName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliConstructorName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliClassRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliClassRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliClassRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliTypeRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliTypeRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliTypeRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliFieldRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliFieldRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliFieldRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliMethodRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliMethodRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliMethodRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HTAB rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HTAB>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HTAB>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_LF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_SP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CRLF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_QUOT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<QUOT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</QUOT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HASH rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HASH>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HASH>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_COMMA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<COMMA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</COMMA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DOT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DOT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DOT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_COLON rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<COLON>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</COLON>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_SEMICOLON rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SEMICOLON>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SEMICOLON>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_EQ rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<EQ>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</EQ>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_UNDERSCORE rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<UNDERSCORE>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</UNDERSCORE>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ALPHA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HEXDIG rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HEXDIG>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HEXDIG>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_VCHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<VCHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</VCHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DOLLAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DOLLAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DOLLAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_PARENTHESES_OPEN rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<PARENTHESES_OPEN>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</PARENTHESES_OPEN>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_PARENTHESES_CLOSE rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<PARENTHESES_CLOSE>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</PARENTHESES_CLOSE>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAny rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAny>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAny>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddFloat2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddFloat2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddFloat2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddDouble2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddDouble2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddDouble2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAddLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAddLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAddLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAndLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAndLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAndLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAget rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAget>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAget>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAgetWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAgetWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAgetWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAput rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAput>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAput>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAputWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAputWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAputWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdArrayLength rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdArrayLength>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdArrayLength>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCheckCast rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCheckCast>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCheckCast>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCmpgDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCmpgDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCmpgDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCmpgFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCmpgFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCmpgFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCmplDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCmplDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCmplDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCmplFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCmplFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCmplFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdCmpLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdCmpLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdCmpLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConst rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConst>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConst>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConst16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConst16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConst16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConst4 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConst4>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConst4>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstClass rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstClass>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstClass>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstHigh16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstHigh16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstHigh16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstString rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstString>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstString>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstStringJumbo rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstStringJumbo>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstStringJumbo>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstWide16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstWide16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstWide16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstWide32 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstWide32>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstWide32>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstWideHigh16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstWideHigh16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstWideHigh16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivFloat2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivFloat2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivFloat2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivDouble2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivDouble2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivDouble2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDivLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDivLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDivLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDoubleToFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDoubleToFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDoubleToFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDoubleToInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDoubleToInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDoubleToInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdDoubleToLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdDoubleToLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdDoubleToLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFillArrayData rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFillArrayData>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFillArrayData>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFilledNewArray rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFilledNewArray>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFilledNewArray>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFilledNewArrayRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFilledNewArrayRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFilledNewArrayRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFloatToDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFloatToDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFloatToDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFloatToInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFloatToInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFloatToInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdFloatToLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdFloatToLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdFloatToLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdGoto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdGoto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdGoto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdGoto16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdGoto16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdGoto16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdGoto32 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdGoto32>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdGoto32>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfEq rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfEq>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfEq>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfEqz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfEqz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfEqz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfGe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfGe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfGe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfGez rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfGez>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfGez>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfGt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfGt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfGt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfGtz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfGtz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfGtz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfLe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfLe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfLe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfLez rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfLez>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfLez>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfLt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfLt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfLt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfLtz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfLtz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfLtz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfNe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfNe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfNe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfNez rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfNez>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfNez>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIget rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIget>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIget>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInstanceOf rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInstanceOf>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInstanceOf>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIntToShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIntToShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIntToShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeDirect rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeDirect>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeDirect>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeDirectRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeDirectRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeDirectRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeInterface rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeInterface>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeInterface>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeInterfaceRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeInterfaceRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeInterfaceRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeStatic rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeStatic>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeStatic>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeStaticRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeStaticRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeStaticRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeSuper rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeSuper>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeSuper>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeSuperRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeSuperRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeSuperRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeVirtual rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeVirtual>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeVirtual>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeVirtualRange rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeVirtualRange>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeVirtualRange>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIput rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIput>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIput>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdLongToDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdLongToDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdLongToDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdLongToFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdLongToFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdLongToFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdLongToInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdLongToInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdLongToInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMonitorEnter rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMonitorEnter>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMonitorEnter>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMonitorExit rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMonitorExit>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMonitorExit>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMove rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMove>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMove>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMove16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMove16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMove16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveException rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveException>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveException>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveFrom16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveFrom16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveFrom16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveObject16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveObject16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveObject16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveObjectFrom16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveObjectFrom16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveObjectFrom16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveResult rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveResult>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveResult>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveResultObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveResultObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveResultObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveResultWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveResultWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveResultWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveWide16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveWide16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveWide16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveWideFrom16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveWideFrom16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveWideFrom16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulFloat2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulFloat2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulFloat2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulDouble2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulDouble2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulDouble2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMulLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMulLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMulLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNegDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNegDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNegDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNegFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNegFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNegFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNegInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNegInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNegInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNegLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNegLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNegLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNewArray rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNewArray>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNewArray>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNewInstance rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNewInstance>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNewInstance>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNop rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNop>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNop>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNotInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNotInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNotInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNotLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNotLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNotLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdOrLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdOrLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdOrLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdPackedSwitch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdPackedSwitch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdPackedSwitch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemFloat2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemFloat2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemFloat2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemDouble2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemDouble2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemDouble2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRemLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRemLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRemLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturn rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturn>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturn>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnVoid rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnVoid>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnVoid>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRsubInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRsubInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRsubInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdRsubIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdRsubIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdRsubIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSget rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSget>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSget>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSgetWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSgetWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSgetWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShlInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShlInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShlInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShlInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShlInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShlInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShlIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShlIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShlIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShlLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShlLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShlLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShlLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShlLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShlLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShrInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShrInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShrInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShrInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShrInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShrInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShrIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShrIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShrIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShrLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShrLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShrLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdShrLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdShrLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdShrLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSparseSwitch rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSparseSwitch>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSparseSwitch>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSput rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSput>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSput>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputBoolean rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputBoolean>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputBoolean>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputByte rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputByte>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputByte>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputChar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputChar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputChar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputShort rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputShort>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputShort>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubFloat rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubFloat>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubFloat>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubFloat2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubFloat2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubFloat2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubDouble rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubDouble>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubDouble>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubDouble2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubDouble2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubDouble2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSubLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSubLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSubLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdThrow rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdThrow>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdThrow>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdUshrInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdUshrInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdUshrInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdUshrInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdUshrInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdUshrInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdUshrIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdUshrIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdUshrIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdUshrLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdUshrLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdUshrLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdUshrLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdUshrLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdUshrLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorInt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorInt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorInt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorInt2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorInt2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorInt2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorIntLit16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorIntLit16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorIntLit16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorIntLit8 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorIntLit8>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorIntLit8>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorLong rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorLong>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorLong>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdXorLong2addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdXorLong2addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdXorLong2addr>");
    terminal = false;
    return null;
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  private Boolean visitRules(ArrayList<Rule> rules)
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
