import java.util.ArrayList;
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
    private String words;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public AnagramChecker() {
        this.setWord1("NO INPUT ENTERED FOR FIRST WORD");
        this.setWord2("NO INPUT ENTERED FOR SECOND WORD");
    }//END DEFAULT CONSTRUCTOR

    /**
     * CONSTRUCTOR passed two String parameters as arguments
     *
     * @param aWord1
     * @param aWord2
     */
    public AnagramChecker(String aWord1, String aWord2) {
        this.setWord1(aWord1.toLowerCase());
        this.setWord2(aWord2.toLowerCase());
    }

    public AnagramChecker(String aString) {
        this.word1 = "art";
        this.word2 = "rat";
        this.words = aString;
    }

    public boolean areTwoWordsAnagrams() {


        //Local variables to method
        char[] word1CharArray = getWord1().toCharArray();
        char[] word2CharArray = getWord2().toCharArray();

        // Check for same number of characters in String, a prerequisite for anagram
        if (this.getWord1().length() != this.getWord2().length())
            return false;

        //If the word is the same as the other word, it is a TRIVIAL anagram and should not be added to group of anagrams
        if (Arrays.equals(word1CharArray, word2CharArray)) {
            return false;
        }
            // Begin Anagram test
        else {
            Arrays.sort(word1CharArray);
            Arrays.sort(word2CharArray);

            // Return whether or not both words are anagrams
            return Arrays.equals(word1CharArray, word2CharArray);
        }
    }

    /**
     * @param arrayOfWords An array of words seperated by a comma delimiter to sort into groups of anagrams
     * @return A sorted String Array of words sorted into
     */
    public ArrayList sortAnagrams(String arrayOfWords) {
        //Local variables to method
        String[] anagramsArray = arrayOfWords.split(",");
        ArrayList<String> arrayListOfWords = new ArrayList<String>();
        ArrayList<String> arrayListOfAnagrams = new ArrayList<String>();


        for (String st : anagramsArray) {
            // Add words to check to the ArrayList
            arrayListOfWords.add(st);
        }//END for

        int j =0;

        for (int i = 0; i < arrayListOfWords.size() - 1; i++) {
            String wordAtI;
            String wordAtNextWord;
            String[] groupOfAnagrams;

            // Begin Array Sorting

            for (String st : arrayListOfWords) {
                j = arrayListOfWords.indexOf(st);

                // Assign variables to String at i and i + 1
                wordAtI = arrayListOfWords.get(i);
                wordAtNextWord = arrayListOfWords.get(j);

                    // Set instance variables to each of the previously initialized words
                    this.setWord1(wordAtI);
                    this.setWord2(wordAtNextWord);

                    // Check if two words are anagrams
                    if (this.areTwoWordsAnagrams()) {

                        // Don't add a word that already exists in the list twice
                        boolean isNotInList = !((arrayListOfAnagrams.contains(arrayListOfWords.get(i))));

                        // Test if words are already contained in the list
                        if (isNotInList) {
                            // They are anagrams, add them to the sorted list of anagrams
                            arrayListOfAnagrams.add(arrayListOfWords.get(i));

                            // Change boolean condition to test if wordAtNextWord is contained in the group of anagrams already
                            isNotInList = !((arrayListOfAnagrams.contains(arrayListOfWords.get(j))));

                            // Test if arrayListOfWords.get(j) is already in the list
                            if (isNotInList) {
                                // Add word at arrayListOfWords.get(j) to the arrayListOfAnagrams
                                arrayListOfAnagrams.add(arrayListOfWords.get(j));
                            }//END Test if arrayListOfWords.get(j) is already in the list
                        }//END Test if words are already contained in the list


                    }//END if (this.areTwoWordsAnagrams()) {

                }//END for (String st : arrayListOfWords)
                j++;



        }//END for (int i = 0; i < arrayListOfWords.size() - 1; i++) {

        return arrayListOfAnagrams;
    }//END public ArrayList sortAnagrams(String arrayOfWords) {

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
}//END CLASS AnagramChecker