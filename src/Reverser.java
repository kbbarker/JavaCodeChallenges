/**
 * CLASS Reverser
 */
public class Reverser {
    // Instance variables to Class
    private String stringToReverse;
    private String stringReversed;

    /**
     * DEFAFULT CONSTUCTOR
     */
    public Reverser() {
        this.setStringToReverse("1234567");
        this.setStringReversed("999");
    }


    public Reverser(String aNumber) {
        this.setStringToReverse(aNumber);
    }


    public String reverse () {
        //Local variables to method
        String sentence = String.valueOf(this.getStringToReverse());

        //RETURN
        return reverse(sentence);
    }

    public static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }//END String reverse(String sentence)reverse

    public String getStringToReverse() {
        return stringToReverse;
    }

    public void setStringToReverse(String stringToReverse) {
        this.stringToReverse = stringToReverse;
    }

    public String getStringReversed() {
        return stringReversed;
    }

    public void setStringReversed(String stringReversed) {
        this.stringReversed = stringReversed;
    }


}//END CLASS NumberReverser

