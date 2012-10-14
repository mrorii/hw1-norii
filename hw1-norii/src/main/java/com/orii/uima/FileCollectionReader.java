package com.orii.uima;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * 
 * A simple Collection Reader for reading in a single file
 * @author Naoki Orii
 *
 */
public class FileCollectionReader extends CollectionReader_ImplBase {
  /**
   * Name of configuration parameter that must be set to the path of the input file.
   */
  public static final String PARAM_INPUTFILE = "InputFile";
  public static final String PARAM_ENCODING = "Encoding";

  private File mInputFile;
  private String[] mLines;
  private String mEncoding;

  private int mCurrentIndex;
  
  public void initialize() throws ResourceInitializationException {
    mInputFile = new File(((String) getConfigParameterValue(PARAM_INPUTFILE)).trim());
    mEncoding  = (String) getConfigParameterValue(PARAM_ENCODING);

    // if input file does not exist or is not a file, throw exception
    if (!mInputFile.exists() || !mInputFile.isFile()) {
      throw new ResourceInitializationException(ResourceConfigurationException.NONEXISTENT_PARAMETER,
              new Object[] { PARAM_INPUTFILE, this.getMetaData().getName(), mInputFile.getPath() });
    }
    
    try {
      String text = FileUtils.file2String(mInputFile, mEncoding);
      mLines = text.split("\\r?\\n");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    mCurrentIndex = 0;
  }
  
  
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }
    
    String line = mLines[mCurrentIndex++];
    jcas.setDocumentText(line);
    
    // Also store location of source document in CAS. This information is critical
    // if CAS Consumers will need to know where the original document contents are located.
    // For example, the Semantic Search CAS Indexer writes this information into the
    // search index that it creates, which allows applications that use the search index to
    // locate the documents that satisfy their semantic queries.
    SourceDocumentInformation srcDocInfo = new SourceDocumentInformation(jcas);
    srcDocInfo.setUri(mInputFile.getAbsoluteFile().toURL().toString());
    srcDocInfo.setOffsetInSource(0);
    srcDocInfo.setDocumentSize((int) mInputFile.length());
    srcDocInfo.setLastSegment(mCurrentIndex == mLines.length);
    srcDocInfo.addToIndexes();
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(mCurrentIndex, mLines.length, Progress.ENTITIES) };
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    return mCurrentIndex < mLines.length;
  }
}
