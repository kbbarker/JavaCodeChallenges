/**
 * CLASS WordReverser
 *
 *  This class has the method <i>reverse()</i> which takes a sentence (one or more words) and reverses the order of those words.
 *
 */

public class WordFinder {
    // Instance Variables to Class
    private String sentence;
    private String wordFound;

    public WordFinder ()
    {
        this.sentence = "NO SENTENCE RECEIVED AS ARGUMENT TO DEFAULT CONSTRUCTOR";
        this.wordFound = "NO WORD FOUND";
    }


    /**
     *
     * @param aSentence A sentence (list of words) to find a word inside.
     */
    public WordFinder (String aSentence)
    {
        this.sentence = aSentence;
        this.wordFound = "NO WORD FOUND";
    }


}
