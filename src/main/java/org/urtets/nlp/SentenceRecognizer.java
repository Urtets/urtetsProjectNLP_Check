package org.urtets.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;


public class SentenceRecognizer {
    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hi! I'm Yury Shageev. I am a teacher of English. I am also learning Java language.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence coreSentence : sentences) {
            System.out.println(coreSentence.toString());
        }
    }
}
