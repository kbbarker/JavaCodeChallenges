/**
 * CLASS FirstWordDeterminer
 *
 *  This class has the method <i>isFirstWordEqaualTo(String x)</i> which takes a word and determines if it is the first
 *  word in a sentence.
 *
 */

import java.lang.*;

public class WordDeterminer
{
    // Instance Variables to Class
    private String sentence;
    private String wordToFind;
    private Boolean isWordFirstWord;


    /**
     * DEFAULT CONSTRUCTOR
     */
    public WordDeterminer()
    {
        this.sentence = "";
        this.wordToFind = "";
        this.isWordFirstWord = false;
    }

    /**
     * CONSTRUCTOR
     *
     * @param aSentence
     * @param wordUsedToCompare
     */
    public WordDeterminer(String aSentence, String wordUsedToCompare)
    {
        this.sentence = aSentence;
        this.wordToFind = wordUsedToCompare;
        this.isWordFirstWord = false;
    }

    public Boolean isFirstWordEqaualTo (String aWord)
    {
        // Local variables to method
        String[] arrayOfWords = this.sentence.split(" ");

        // Return whether first word is eqaul to aWord
        return arrayOfWords[0].equals(aWord);
    }

    public int findNumberOfTimesForWord (String theWordToFind)
    {
        // Local variables to method
        int numTimesFound = 0;
        String[] arrayOfWords = this.sentence.split(" ");
        int numTimesToIterate = arrayOfWords.length -1;

        for (int i = 0; i  <= numTimesToIterate; i++ )
        {
            if (arrayOfWords[i].contains(this.wordToFind)) {
                numTimesFound ++;
            }//END if
        }//END for

        //RETURN number of times words is found in sentence
        return numTimesFound;
    }

    public String getSentence() {
        return sentence;
    }

    /**
     *
     * @param sentence
     */
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    /**
     *
     * @return
     */
    public String getWordToUseForDetermination() {
        return wordToFind;
    }

    /**
     *
     * @param wordToUseForDetermination
     */
    public void setWordToUseForDetermination(String wordToUseForDetermination) {
        this.wordToFind = wordToUseForDetermination;
    }

    /**
     *
     * @return
     */
    public Boolean getWordFirstWord() {
        return isWordFirstWord;
    }

    /**
     *
     * @param wordFirstWord
     */
    public void setWordFirstWord(Boolean wordFirstWord) {
        isWordFirstWord = wordFirstWord;
    }
}
