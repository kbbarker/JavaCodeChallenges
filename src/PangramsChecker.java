/**
 * CLASS AnagramChecker
 *
 * This class checks to see if a sentence (list of words) contains any anagrams. The first method,
 * <i>areTwoWordsAnagrams</i> compares a pair of words received and returns TRUE is they are anagrams and FALSE
 * if they are not anagrams of each other.
 */

@SuppressWarnings("SpellCheckingInspection")
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

    // Method to check if a letter occurs once and ONLY once in a sentence
    static final boolean hasOnlyOneCharOccurrence(String s, int ch) {
        int index = s.indexOf(ch);
        return index == -1 ? false : s.lastIndexOf(ch) == index;
    }

    // Check to determine if the input is a PERFECT PANAGRAM
    public boolean isPerfectPangram() {
        //Local variables to method
        boolean isAPerfectPanagram = false;

        // Tests for only one occurrence for all 26 letters of the alphabet
        boolean a = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 97);
        boolean b = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 98);
        boolean c = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 99);
        boolean d = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 100);
        boolean e = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 101);
        boolean f = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 102);
        boolean g = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 103);
        boolean h = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 104);
        boolean i = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 105);
        boolean j = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 106);
        boolean k = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 107);
        boolean l = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 108);
        boolean m = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 109);
        boolean n = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 110);
        boolean o = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 111);
        boolean p = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 112);
        boolean q = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 113);
        boolean r = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 114);
        boolean s = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 115);
        boolean t = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 116);
        boolean u = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 117);
        boolean v = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 118);
        boolean w = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 119);
        boolean x = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 120);
        boolean y = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 121);
        boolean z = PangramsChecker.hasOnlyOneCharOccurrence(this.getSentence(), 122);

        if (a && b && c && d && e && f && g && h && i && j
                && k && l && m && n && o && p && q && r &&
                s && t && u && v && w && x && y && z)
            isAPerfectPanagram = true;
        else
            isAPerfectPanagram = false;


        // RETURN
        return isAPerfectPanagram;
    }
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
}//END CLASS PangramsChecker


