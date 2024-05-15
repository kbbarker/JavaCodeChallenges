import java.lang.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * <pre>
 * CLASS Main   - This class contains the main(String[] args) method that gives functionality to "run" the
 *                  essential requirements for each of the code challenges.
 *
 *                  As each code challenge is completed, its code is commented out and a block comment left above it
 *                  describing the nature and specifications of each challenge with a heading of the CHALLENGE #
 *                  at the top of this block comment.
 * </pre>
 */
public class Main {


    public static void main(String[] args) {
        // Local variables to Main
        int number = (int) 2000023;
        PrimeFactorsFinder test = new PrimeFactorsFinder(number);

        // Determine Prime Factors
        test.determinePrimeFactors(number);

        System.out.print("The prime factors of " + number + " are: ");

        for (int i= 0; i < test.getPrimeFactors().size(); i++) {
            System.out.print(test.getPrimeFactors().get(i) + " " );
        }//END for (int i= 0; i < test.getPrimeFactors().size() - 1; i++)
    }//END main method public static void main(String[] args)

}//END CLASS Main


    /*
        // CHALLENGE #9 COMPLETE
        //      BONUS CHALLENGE TO BE COMPLETED LATER AFTER FINISHING CHALLENGE #10
        public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Local variables to Main
        PrimeTester test = new PrimeTester(823786971);
        boolean isNumberPrime = test.isPrime(test.getNumber());

        System.out.print("The number " + test.getNumber() + " is ");
        if (!(isNumberPrime))
                System.out.print("NOT ");

        System.out.print("prime.");
    */

        /*
        CHALLENGE 8 COMPLETE WITH BONUS ALSO COMPLETE

        // Local variables to main
        int[] testArray1 = {1,2,534223,3,45,5,6,-1,0,-9,9,12};
        ProductMaximizer test = new ProductMaximizer(testArray1);

        int maximumProduct = test.findMaximumProduct();

        System.out.println("The maximum product of the numbers in the array is: "
                 + maximumProduct + "\n\n");

        int[] testArray2 = {1,2,3,45,5,6,-1,72,-72,0,-9,9,12};
        //TESTED AND WORKED!! -- int[] testArray2 = {}; // Test an empty Array
        ProductMaximizer test2 = new ProductMaximizer(testArray1);

        maximumProduct = test2.findMaximumProduct(testArray1, testArray2);

        System.out.println("The maximum product of the largest numbers from TWO ARRAYS of numbers is: "
                + test2.getLargestProduct() + "\n");
        */


        /*
        CHALLENGE #6: COMPLETED

        This one is a technical interview favorite. For a given input number, return the
        number in reverse. So, an input of 3956 should return 6593.

        If you’re ready for a bigger challenge, reverse a decimal number. The decimal point should stay in
        the same place. So, the number 193.56 should output 653.91.



        // Local variables to Main
        String aString = "012345";

        System.out.println("Original String: " + aString);
        Reverser reverser = new Reverser();

        reverser.setStringToReverse(aString);

        String i = reverser.reverse();

        System.out.println("Reversed String: " + i);
        */

         /*
        CHALLENGE #5: PANOGRAMS WITH BONUS COMPLETE!!!

        A pangram is a sentence that contains all 26 letters of the English alphabet. One of the most well-known
        examples of a pangram is, “The quick brown fox jumps over the lazy dog.” Create a pangram checker that
         returns a Boolean TRUE if an input string is a pangram and FALSE if it isn’t.

        For an added pangram challenge, create a perfect pangram checker. A perfect pangram is a sentence that
        uses each letter of the alphabet only once, such as, “Mr. Jock, TV quiz Ph.D., bags few lynx.”

        // END CHALLENGE #5 Specification

        String testInput = "The quick brown fox jumps over the lazy dog";
        testInput = "The five boxing wizards jump quickly.";
        testInput = "Pack my box with five dozen liquor jugs.";
        testInput = "Mr. Jock, TV quiz Ph. D., bags few lynx";

        testInput = testInput.toLowerCase();



        PangramsChecker tester = new PangramsChecker(testInput);

        tester.checkIfPangram();
        if (tester.isPerfectPangram())
            System.out.println(tester.getSentence() + " IS a PERFECT pangram");
        else
            System.out.println(tester.getSentence() + " is NOT a PERFECT pangram");

        // IF the input is a Pangram, print this to the screen
        if ( tester.isPangram() )
            System.out.println(tester.getSentence() + " IS a pangram");
        else
            System.out.println(tester.getSentence() + " is NOT a pangram");
    }//EMD public static void main(String[] args)
    */


        /*
        CHALLENGE #4: COMPLETE WITH BONUS COMPLETE

        Two words are anagrams if they contain the same letters but in a different order. Here are a few examples
        of anagram pairs:

            “listen” and “silent”
            “binary” and “brainy”
            “Paris” and “pairs”

        For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.

        BONUS CHALLENGE
        As an added challenge, for a given array of strings, return separate lists that group anagrams together.
        For example, the input {“tar,” “rat,” “art,” “meats,” “steam”}, the output should look something like
        {[“tar,” “rat,” “art”], [“meats,” “steam”]}.


        // Local variables to main
        String arrayOfWords = new String("listen,study,silent,dusty,rat,art,bart,save,hat,tar,vase");
        AnagramChecker tester2 = new AnagramChecker(arrayOfWords);

       // AnagramChecker tester = new AnagramChecker  ("listen", "silent");

        /* PART OF NON-BONUS CHALLENGE #4
        if (tester.areTwoWordsAnagrams())
            System.out.println("Both words are anagrams.");
        else
            System.out.println("Both words are NOT anagrams.");


        ArrayList sortedAnagrams = tester2.sortAnagrams(arrayOfWords);
        System.out.println(sortedAnagrams.toString());

        //tester2.areTwoWordsAnagrams();

        */ // END CHALLENGE #4

        /*
        CHALLENGE #3: COMPLETE WITH BONUS CHALLENGE

         For a given input string, return a Boolean TRUE if the string starts with a given input word.
        So, for an input string of “hello world” and input word “hello,” the program should return TRUE.

        For a more advanced word searcher, create a program that returns the number of times a word appears in an
        input string. For example, given an input word “new” and an input string “I’m the new newt,”
        the program should return a value of 2.


        // Local Variables to Main
        Scanner scanner = new Scanner(System.in);           // Instantiate a Scanner to read input from user
        String inputSentence = "";
        String inputToCheckAsFirstWord = "";
        String wordToFind = "";

        // For EASY CHALLENGE
        WordDeterminer tester1 = new WordDeterminer(inputSentence, inputToCheckAsFirstWord);

        // For BONUS CHALLENGE
        WordDeterminer tester2 = new WordDeterminer(inputSentence,wordToFind);
        // Ask for first input to be a sentence (list of words)
        System.out.println("Please enter a sentence: ");
        inputSentence = scanner.nextLine();
        tester1.setSentence(inputSentence);
        tester2.setSentence(inputSentence);

        /* EASY CHALLENGE ***
        // Ask for second input to be a word to compare to first word
        System.out.println("\n\nPlease enter a word to compare to first word of your sentence: ");
        inputToCheckAsFirstWord = scanner.nextLine();
        tester1.setWordToUseForDetermination(inputToCheckAsFirstWord);
        // IF word equals first word print "Your word is equal to the first word of your sentence"
        if (tester1.isFirstWordEqaualTo(inputToCheckAsFirstWord)) {
            System.out.println("\n\nYour word is equal to the first word of your sentence");
        }//END if

        // Word is not equal so print "Your word is NOT equal to the first word of your sentence"
        else {
            System.out.println("\n\nYour word is NOT equal to the first word of your sentence");
        }//END else

        //END EASY CHALLENGE

        // BONUS CHALLENGE
        // Ask for second input to be a word to find in sentence
        System.out.println("\n\nPlease enter a word to find in your sentence: ");
        wordToFind = scanner.nextLine();
        tester2.setWordToUseForDetermination(wordToFind);

        // Find number of times word appears in sentence
        System.out.println("Your word '" + wordToFind + "' was found " +
                tester2.findNumberOfTimesForWord(wordToFind) +
                " times.");

        */



        /*
        CHALLENGE #2: COMPLETE with bonus completed

        try {
            // Local Variables to Main
            Scanner scanner = new Scanner(System.in);                       // Instantiate a Scanner to read input from user
            WordFinder testWordFinder = new WordFinder("1 2 3 4 5 6 7 8 9 0");  // Instantiate a WordFinder Object
            int nThWordToFind = 0;

            // Find the second to last word in the sentence and print it to the screen
            System.out.println ("The second to last word in the sentence you provided is " +
                    testWordFinder.findWord(testWordFinder.getSentence()) + ".");

            // White Space
            System.out.println("\n\n");

            // Prompt user to enter which Nth word to find in the sentence
            System.out.println("Please enter the number of which ordered word to find: ");
            nThWordToFind = (scanner.nextInt());

            // Special case when a wily user tries to say find the 0th (or possibly a negativeTH) word
            if (nThWordToFind <=0) {
                throw new ArrayIndexOutOfBoundsException("User entered a number less than 1");
            }

            System.out.println("The " + nThWordToFind + " word in the sentence is " +
                    testWordFinder.findWord(testWordFinder.getSentence(), nThWordToFind ) + ".");
        }
        catch (Exception e) {
            System.out.println("Exception thrown: "+ e.toString());
        }
    */







        /* CHALLENGE #1: COMPLETE
         * This challenge was to ask the user to enter a sentence and then return the sentence with the words listed
         * in the reverse order. So if the sentence was "1 2 3" the printed output to the screen would be "3 2 1"

         // Local Variables to Main
         WordReverser tester1 = new WordReverser();   // Instantiate a WordReverser
         Scanner scanner = new Scanner(System.in);   // Instantiate a Scanner to read input from user
         String sentence = null;                     // Create and initialize a variable for the sentence of words
         String reversedWord = "";                   // Create and initialize a variable for the reversed word

         System.out.print("Enter a sentence please: ");
         sentence = scanner.nextLine();
         System.out.println("\n\n");

        // Reverse the words provided
        reversedWord = tester1.reverse(sentence);

        // Print the reversed word to the screen
        System.out.println("Your word reversed is: " + reversedWord);

        // Thank the user for playing Word Reverser!
        System.out.println("\n\n" + " Thank you for playing word reverser with me!" + "\n");

         *** END CODE CHALLENGE #1's CODE ***

    }//END public static void main(

}//END CLASS Main

 */




