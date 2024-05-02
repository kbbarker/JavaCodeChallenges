/**
 * CLASS WordReverser
 *
 *  This class has the method <i>reverse()</i> which takes a sentence (one or more words) and reverses the order of those words.
 *
 */

import java.lang.*;
public class WordReverser {
    //Instance Variables
    private String word;
    private String wordReversed;

    // Default Constructor
    public WordReverser ()
    {
        this.word = "NO WORD RECEIVED AS ARGUMENT TO CONSTRUCTOR";
        this.wordReversed = "";
    };

    public WordReverser (String aWord)
    {
        this.word = aWord;
        this.wordReversed = "";
    }

    public String reverse(String wordToReverse)
    {
        //Local Variables
        String[] sentence = null;
        sentence = wordToReverse.split(" ");

        for (int i = sentence.length -1; (i>= 0); i--) {
            this.wordReversed += sentence[i];
            if (i!= 0) {
                this.wordReversed += " ";
            }// END if

        }//END for (int i = w.length; (i>= 0); i--) {

        //RETURN
        return wordReversed;
    }//END public String reverse(String wordToReverse)



}
