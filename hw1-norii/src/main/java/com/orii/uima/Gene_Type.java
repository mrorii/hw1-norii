
/* First created by JCasGen Sat Oct 13 16:01:06 EDT 2012 */
package com.orii.uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sat Oct 13 23:40:37 EDT 2012
 * @generated */
public class Gene_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.orii.uima.Gene");
 
  /** @generated */
  final Feature casFeat_sentenceID;
  /** @generated */
  final int     casFeatCode_sentenceID;
  /** @generated */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "com.orii.uima.Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceID);
  }
  /** @generated */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "com.orii.uima.Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rawString;
  /** @generated */
  final int     casFeatCode_rawString;
  /** @generated */ 
  public String getRawString(int addr) {
        if (featOkTst && casFeat_rawString == null)
      jcas.throwFeatMissing("rawString", "com.orii.uima.Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rawString);
  }
  /** @generated */    
  public void setRawString(int addr, String v) {
        if (featOkTst && casFeat_rawString == null)
      jcas.throwFeatMissing("rawString", "com.orii.uima.Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_rawString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceID = jcas.getRequiredFeatureDE(casType, "sentenceID", "uima.cas.String", featOkTst);
    casFeatCode_sentenceID  = (null == casFeat_sentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceID).getCode();

 
    casFeat_rawString = jcas.getRequiredFeatureDE(casType, "rawString", "uima.cas.String", featOkTst);
    casFeatCode_rawString  = (null == casFeat_rawString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rawString).getCode();

  }
}



    