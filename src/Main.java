import java.lang.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*
        CHALLENGE #2
         */
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








        /** CHALLENGE #1: COMPLETE
         * This challenge was to ask the user to enter a sentence and then return the sentence with the words listed
         * in the reverse order. So if the sentence was "1 2 3" the printed output to the screen would be "3 2 1"

         // Local Variables to Main
         WordReverser tester = new WordReverser();   // Instantiate a WordReverser
         Scanner scanner = new Scanner(System.in);   // Instantiate a Scanner to read input from user
         String sentence = null;                     // Create and initialize a variable for the sentence of words
         String reversedWord = "";                   // Create and initialize a variable for the reversed word

         System.out.print("Enter a sentence please: ");
         sentence = scanner.nextLine();
         System.out.println("\n\n");

        // Reverse the words provided
        reversedWord = tester.reverse(sentence);

        // Print the reversed word to the screen
        System.out.println("Your word reversed is: " + reversedWord);

        // Thank the user for playing Word Reverser!
        System.out.println("\n\n" + " Thank you for playing word reverser with me!" + "\n");

         *** END CODE CHALLENGE #1's CODE ***
         */

        }//END public static void main(String[] args)

    }//END CLASS Main
