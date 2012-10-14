package com.orii.uima;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

public class SentenceAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // get document text
    String line = aJCas.getDocumentText();
    
    Sentence annotation = new Sentence(aJCas);
      
    int whiteSpaceIndex = line.indexOf(" ");
    String id = line.substring(0, whiteSpaceIndex);
    String string = line.substring(whiteSpaceIndex + 1);
      
    annotation.setSentenceID(id);
    annotation.setRawString(string);
    annotation.setBegin(whiteSpaceIndex);
    annotation.setEnd(line.length());
    annotation.addToIndexes();
  }
}
