import java.util.ArrayList;
import java.util.Arrays;

/**
 * <pre>
   CLASS PrimeFactorsFinder - A prime factorization calculator that returns the prime factors of any number
                               between 2 and 100.

                               NOTE: The prime factors of a number are all the integers below that number that
                                       are divisible into the number as well as 1. For example, the prime factors
                                       of 12 are 1,2,3,4,6, and 12.
 </pre>
 */
public class PrimeFactorsFinder {
    // Instance variables to the class
    private int numberToFindPrimeFactors;
    private ArrayList<Integer> primeFactors;
    private PrimeTester primeTester;


    /**
     * <pre>
     *     DEFAULT CONSTRUCTOR
     * </pre>
     */

    /*
    public PrimeFactorsFinder () {
        this.setNumberToFindPrimeFactors(-1);
        this.setPrimeFactors(new ArrayList<Integer>());
        this.setPrimeTester(new PrimeTester());
    }//END DEFAULT CONSTRUCTOR
    */
    /**
     * CONSTRUCTOR that receives an int as a parameter and assigns this int to the Instance Variable,
     * <i>numberToFindPrimeFactors</i>.
     *
     * @param aNumber - The number from which the prime factors will be found
     */
    public PrimeFactorsFinder (int aNumber) {
        this.setNumberToFindPrimeFactors(aNumber);
        this.setPrimeFactors(new ArrayList<Integer>());
        this.setPrimeTester(new PrimeTester(aNumber));
    }// END CONSTRUCTOR

    // Method to determine prime factors of numberToFindPrimeFactors
    public ArrayList<Integer> determinePrimeFactors (int number) {

        // Add 1 to primeFactors
        this.primeFactors.add(1);

        //Determine if number is prime first. If number is prime, then only return 1 and itself
        if (primeTester.isPrime(getNumberToFindPrimeFactors())) {

            this.primeFactors.add(number);
            return primeFactors;
        }//

        // number is not prime, so begin the factorization test
        else {
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0)
                    this.primeFactors.add(i);
            }//END for (int i = 0; i < primeFactors.size(); i++)

        }//END else

        // Add the number itself to the list primeFactors
        this.primeFactors.add(number);

        // RETURN
        return primeFactors;
    }//END method public ArrayList<Integer> determinePrimeFactors

    public int getNumberToFindPrimeFactors() {
        return this.numberToFindPrimeFactors;
    }

    public void setNumberToFindPrimeFactors(int numberToFindPrimeFactors) {
        this.numberToFindPrimeFactors = numberToFindPrimeFactors;
    }

    public ArrayList<Integer> getPrimeFactors() {
        return this.primeFactors;
    }

    public void setPrimeFactors(ArrayList<Integer> primeFactors) {
        this.primeFactors = primeFactors;
    }

    public PrimeTester getPrimeTester() {
        return this.primeTester;
    }

    public void setPrimeTester(PrimeTester primeTester) {
        this.primeTester = primeTester;
    }
}//END CLASS

