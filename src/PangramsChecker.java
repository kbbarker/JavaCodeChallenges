/**
 * CLASS AnagramChecker
 *
 * This class checks to see if a sentence (list of words) contains any anagrams. The first method,
 * <i>areTwoWordsAnagrams</i> compares a pair of words received and returns TRUE is they are anagrams and FALSE
 * if they are not anagrams of each other.
 */

public class PangramsChecker {
    //Instance Variables to Class
    private String sentence;
    private String[] stArray;
    private boolean isPangram;
    private int arraySize;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public PangramsChecker () {
        this.setArraySize(100);
        this.setSentence("NO SENTENCE AVAILABLE SINCE DEFAULT CONSTRUCTOR WAS USED");
        this.setPangram(false);
        this.setStArray(new String[getArraySize()]);
    }//END DEFAULT CONSTRUCTOR

    /**
     * CONSTRUCTOR public PangramsChecker (String aSentence)
     * @param aSentence
     */
    public PangramsChecker (String aSentence) {
        this.setArraySize(aSentence.length());
        this.setSentence(aSentence);
        this.setPangram(false);
        this.setStArray(new String[getArraySize()]);
    }//END CONSTRUCTOR public PangramsChecker (String aSentence)

    // Methods
    public boolean checkIfPangram() {
        // Local variables to method
        boolean isAPangram = false;
        String inputString = this.getSentence();

        // Determine if inputString contains every letter in the alphabet, and thus would be classified as a Pangram
        if (inputString.contains("a") &&
                (inputString.contains("c")) &&
                (inputString.contains("d")) &&
                (inputString.contains("e")) &&
                (inputString.contains("f")) &&
                (inputString.contains("g")) &&
                (inputString.contains("h")) &&
                (inputString.contains("i")) &&
                (inputString.contains("j")) &&
                (inputString.contains("k")) &&
                (inputString.contains("l")) &&
                (inputString.contains("m")) &&
                (inputString.contains("n")) &&
                (inputString.contains("o")) &&
                (inputString.contains("p")) &&
                (inputString.contains("q")) &&
                (inputString.contains("r")) &&
                (inputString.contains("s")) &&
                (inputString.contains("t")) &&
                (inputString.contains("u")) &&
                (inputString.contains("v")) &&
                (inputString.contains("w")) &&
                (inputString.contains("x")) &&
                (inputString.contains("y")) &&
                (inputString.contains("z"))
        ) {
            this.setPangram(true);
        }

        //The input is NOT a pangram
        else
            this.setPangram(false);

        //RETURN
        return this.isPangram();
    }//END public boolean checkIfPangram()


    // ENCAPSULATED FIELDS
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String[] getStArray() {
        return stArray;
    }

    public void setStArray(String[] stArray) {
        this.stArray = stArray;
    }

    public boolean isPangram() {
        return isPangram;
    }

    public void setPangram(boolean pangram) {
        isPangram = pangram;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }
}//END CLASE PangramsChecker


