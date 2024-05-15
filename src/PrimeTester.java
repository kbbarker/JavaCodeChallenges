import java.util.ArrayList;
import java.lang.*;

/**
 * CLASS PrimeTester - A prime number is any whole number greater than 1 whose only factors are 1 and itself.
 *                      For example, 7 is a prime number because it’s only divisible by 1 and 7.
 *
 *                     Create a function that returns TRUE if an input number is prime. The first few prime
 *                     numbers are 2, 3, 5, 7, 11, 13, 17, and 19.
 *
 *                      ** BONUS CHALLENGE **
 *                      For a slightly harder challenge, create a prime number calculator that outputs all prime
 *                      numbers between 2 and the input number.
 */
public class PrimeTester {
    // Instance variables to class
    private boolean isPrime;
    private int number;
    ArrayList <Integer> primeFactors
            ;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public PrimeTester() {
        this.setIsPrime(false);
        this.setNumber(-1);
        this.primeFactors = new ArrayList<Integer>(null);
    }//END DEFAULT CONSTRUCTOR public PrimeTester()

    /**SAZ
     * CONSTRUCTOR - Accepts one int as a parameter.
     * @param aNumber Variable of type int that accepts as a parameter, the number that is needs to evaluated for
     *                its primality.
     */
    public PrimeTester(int aNumber){
        this.setIsPrime(false);
        this.setNumber(aNumber);
        this.primeFactors = new ArrayList<Integer>(2);
    }//END CONSTRUCTOR  public PrimeTester(int aNumber)dsd           ad7

    // Method to check if a number is prime

    /**
     * This method returns a boolean result which is the evaluation of whether the number of type int it receives
     * as a parameter is prime.
     *
     * @param number A variable of type int which is a number that needs its primality determined.
     * @return  A boolean variable, which is the evaluation of whether the number of type int the
     *              <i>isPrime(int number)</i> method receives as a parameter is or is not prime. If the number
     *              IS prime, then the value returned is TRUE. If the number is NOT prime, then the value returned
     *              is FALSE.
     */
    public  boolean isPrime(int number) {
        if (number <= 1) {
            this.isPrime = false;
            return this.isPrime;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                this.isPrime = false;
                return this.isPrime;
            }
        }

        this.isPrime = true;
        return isPrime;
    }//END public  boolean isPrime(int number)

    // BONUS CHALLENGE #9

    /**
     * This method encapsulates the private Instance variable of type boolean, <i>isPrime</i> and sets this Instance
     * variable to the value received as a parameter to the value it receives..
     *
     * @param prime A number determined to be prime by the class's implementation of the <i>isPrime(int number)</i>
     *              method.
     *
     */
    public void setIsPrime(boolean prime) {
        isPrime = prime;
    }


    public boolean getIsPrime () {
        //RETURN
        return isPrime;
    }//END method public boolean getIsPrime ()

    /**
     * This method encapsulates the private instance variable to the class, <i>number</i>, is a "getter funtion"
     * that returns a value of type int to the caller of the method which is the value of the <i>number</i> instance
     * variable.
     *
     * @return The value of type int to the caller of the method which is the value of the <i>number</i>
     * instance varaible <i>number</i> which is <i>private</i> to the class.
     */
    public int getNumber() {
        //RETURN
        return number;
    }//END method public int getNumber()

    public void setNumber(int number) {
        this.number = number;
    }//END method public void setNumber(int number)
}
