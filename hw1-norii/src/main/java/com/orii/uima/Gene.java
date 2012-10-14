

/* First created by JCasGen Sat Oct 13 16:01:06 EDT 2012 */
package com.orii.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Oct 13 18:12:34 EDT 2012
 * XML source: /Users/orii/git/hw1-norii/hw1-norii/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sentenceID

  /** getter for sentenceID - gets ID of sentence including this gene
   * @generated */
  public String getSentenceID() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "com.orii.uima.Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_sentenceID);}
    
  /** setter for sentenceID - sets ID of sentence including this gene 
   * @generated */
  public void setSentenceID(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "com.orii.uima.Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_sentenceID, v);}    
   
    
  //*--------------*
  //* Feature: rawString

  /** getter for rawString - gets Raw string of this gene
   * @generated */
  public String getRawString() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_rawString == null)
      jcasType.jcas.throwFeatMissing("rawString", "com.orii.uima.Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_rawString);}
    
  /** setter for rawString - sets Raw string of this gene 
   * @generated */
  public void setRawString(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_rawString == null)
      jcasType.jcas.throwFeatMissing("rawString", "com.orii.uima.Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_rawString, v);}    
   
    
  //*--------------*
  //* Feature: offsetBegin

  /** getter for offsetBegin - gets Offset beginning location
   * @generated */
  public int getOffsetBegin() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_offsetBegin == null)
      jcasType.jcas.throwFeatMissing("offsetBegin", "com.orii.uima.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_offsetBegin);}
    
  /** setter for offsetBegin - sets Offset beginning location 
   * @generated */
  public void setOffsetBegin(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_offsetBegin == null)
      jcasType.jcas.throwFeatMissing("offsetBegin", "com.orii.uima.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_offsetBegin, v);}    
   
    
  //*--------------*
  //* Feature: offsetEnd

  /** getter for offsetEnd - gets Offset ending location
   * @generated */
  public int getOffsetEnd() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_offsetEnd == null)
      jcasType.jcas.throwFeatMissing("offsetEnd", "com.orii.uima.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_offsetEnd);}
    
  /** setter for offsetEnd - sets Offset ending location 
   * @generated */
  public void setOffsetEnd(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_offsetEnd == null)
      jcasType.jcas.throwFeatMissing("offsetEnd", "com.orii.uima.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_offsetEnd, v);}    
  }

    