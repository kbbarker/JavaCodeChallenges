/**
 * CLASS WordFinder
 *
 *  This class has the method <i>findWord(String x)</i> which takes a sentence (one or more words) and finds the
 *  second to last word in that sentence. If a one word sentence is given as input, then that word will be returned by
 *  the findWord method.
 *
 */
import java.lang.*;

public class WordFinder {
    // Instance Variables to Class
    private String sentence;
    private String wordFound;

   /*
        DEFAULT CONSTRUCTOR
    */
    public WordFinder ()
    {
        this.setSentence("NO SENTENCE RECEIVED AS ARGUMENT TO DEFAULT CONSTRUCTOR");
        this.setWordFound("NO WORD FOUND");
    }

    /**
     *  CONSTRUCTOR taking a String representing the sentence from which to find the word.
     *
     * @param aSentence A sentence (list of words) to find a word inside.
     */
    public WordFinder (String aSentence)
    {
        this.setSentence(aSentence);
        this.setWordFound("NO WORD FOUND");
    }

    // Constructor

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getWordFound() {
        return wordFound;
    }

    public void setWordFound(String wordFound) {
        this.wordFound = wordFound;
    }

    public String findWord (String aSentence)
    {
        //Local variables to method
        String aWord = "";
        String[] wordArray = this.getSentence().split(" ");

        // For most cases
        if (wordArray.length > 1) {
            aWord = wordArray[wordArray.length - 2];
        }
        // Special case when sentence only has one word
        else if (wordArray.length == 1) {
            aWord = wordArray[0];
        }
        // Super special case when sentence is has no words in it at all
        else {
            aWord = "SENTENCE HAS NO WORDS";
        }

        // For good measure, use the Instance Variable wordFound by setting it to the value of the word found.
        setWordFound(aWord);

        //Return a String
        return aWord;
    }

    public String findWord (String aSentence, int nthWordToFind)
    {
        //Local variables to method
        String aWord = "";
        String[] wordArray = this.getSentence().split(" ");

        // For most cases
        if (wordArray.length > 1) {
            aWord = wordArray[nthWordToFind -1];
        }
        // Special case when sentence only has one word
        else if (wordArray.length == 1) {
            aWord = wordArray[0];
        }
        // Super special case when sentence is has no words in it at all
        else {
            aWord = "SENTENCE HAS NO WORDS";
        }

        // For good measure, use the Instance Variable wordFound by setting it to the value of the word found.
        setWordFound(aWord);

        //Return a String
        return aWord;

        //RETURN the Nth word found in the sentence
    }
}
