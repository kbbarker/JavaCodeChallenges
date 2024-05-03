import java.util.Arrays;

/**
 * CLASS AnagramChecker
 *
 * This class checks to see if a sentence (list of words) contains any anagrams. The first method,
 * <i>areTwoWordsAnagrams</i> compares a pair of words received and returns TRUE is they are anagrams and FALSE
 * if they are not anagrams of each other.
 */
public class AnagramChecker {
    //Instance Variables to Class
    private String word1;
    private String word2;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public AnagramChecker () {
        this.setWord1("NO INPUT ENTERED FOR FIRST WORD");
        this.setWord2("NO INPUT ENTERED FOR SECOND WORD");
    }//END DEFAULT CONSTRUCTOR

    /**
     * CONSTRUCTOR passed two String parameters as arguments
     * @param aWord1
     * @param aWord2
     */
    public AnagramChecker (String aWord1, String aWord2) {
        this.setWord1(aWord1.toLowerCase());
        this.setWord2(aWord2.toLowerCase());
    }

    public boolean areTwoWordsAnagrams () {

        //Local variables to method
        char[] word1CharArray = getWord1().toCharArray();
        char[] word2CharArray = getWord2().toCharArray();

        // Check for same number of characters in String
        if (this.getWord1().length() != this.getWord2().length())
            return false;
        // Begin Anagram test
        else {
            Arrays.sort(word1CharArray);
            Arrays.sort(word2CharArray);

            // Return whether or not both words are anagrams
            return Arrays.equals(word1CharArray,word2CharArray);

        }
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }
}