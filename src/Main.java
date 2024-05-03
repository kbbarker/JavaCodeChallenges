import java.lang.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*
        CHALLENGE #4:

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
         */

        // Local variables to main
        AnagramChecker tester = new AnagramChecker  ("rat", "art");

        //
        if (tester.areTwoWordsAnagrams())
            System.out.println("Both words are anagrams.");
        else
            System.out.println("Both words are NOT anagrams.");

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
         */

        }//END public static void main(String[] args)

    }//END CLASS Main
