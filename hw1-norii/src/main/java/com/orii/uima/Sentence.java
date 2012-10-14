

/* First created by JCasGen Sat Oct 13 15:57:22 EDT 2012 */
package com.orii.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Oct 13 23:40:37 EDT 2012
 * XML source: /Users/orii/git/hw1-norii/hw1-norii/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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

  /** getter for sentenceID - gets ID of this sentence
   * @generated */
  public String getSentenceID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "com.orii.uima.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceID);}
    
  /** setter for sentenceID - sets ID of this sentence 
   * @generated */
  public void setSentenceID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "com.orii.uima.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceID, v);}    
   
    
  //*--------------*
  //* Feature: rawString

  /** getter for rawString - gets Raw string of this sentence
   * @generated */
  public String getRawString() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_rawString == null)
      jcasType.jcas.throwFeatMissing("rawString", "com.orii.uima.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_rawString);}
    
  /** setter for rawString - sets Raw string of this sentence 
   * @generated */
  public void setRawString(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_rawString == null)
      jcasType.jcas.throwFeatMissing("rawString", "com.orii.uima.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_rawString, v);}    
  }

    