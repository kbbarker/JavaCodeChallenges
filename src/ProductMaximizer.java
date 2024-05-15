import java.util.Arrays;

/**
 * CLASS ProductMaximizer:  For a given input array of numbers, find the two that result in the largest product.
 * The output should include the two numbers in the array along with their product.
 *
 * As an extra challenge, use an input of two arrays of numbers and find two numbers — one from each
 * input array — that results in the largest product.
 */


public class ProductMaximizer {
    // Instance variables to class
    private int[] arrayOfNumbers1;
    private int[] arrayOfNumbers2;
    private int sizeOfArray;
    private int aProduct;
    private int largestProduct;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public ProductMaximizer() {
        this.setSizeOfArray(10);
        this.arrayOfNumbers1 = new int[sizeOfArray];
        this.aProduct = 0;
        this.largestProduct = -1;
    }//END DEFAULT CONSTRUCTOR

    /**
     *  CONSTRUCTOR  - Constructor that receives an int array as a parameter.
     *                Initializes this.arrayOfNumbers1 to the array passed to it as a parameter.
     *                Initializes this.aProduct to -1 since no value for this is passed as a parameter.
     *                Initializes this.largestProduct to -1 since no value for this is passed as a parameter.
     * @param anIntArray
     */
    public ProductMaximizer(int[] anIntArray) {
        this.arrayOfNumbers1 = anIntArray;
        this.aProduct = -1;
        this.largestProduct = -1;
    }

    /**
     *  CONSTRUCTOR  - Constructor that receives an int array as a parameter.
     *                Initializes this.arrayOfNumbers1 to the array passed to it as a parameter.
     *                Initializes this.aProduct to -1 since no value for this is passed as a parameter.
     *                Initializes this.largestProduct to -1 since no value for this is passed as a parameter.
     * @param anArray1
     * @param anArray2
     */
    public ProductMaximizer(int[] anArray1, int[] anArray2) {
        this.setArrayOfNumbers1(anArray1);
        this.setArrayOfNumbers1(anArray2);
        this.aProduct = -1;         // Initializes this.aProduct to -1 since no value for this is passed as a parameter.
        this.largestProduct = -1;   // Initializes this.largestProduct to -1 since no value for this is passed as a parameter.
    }//END CONSTRUCTOR   public ProductMaximizer(int[] anArray1, int[] anArray2)


    public int getProduct(int num1, int num2) {
        //RETURN product of two numbers in array
        return num1 * num2;
    }//END  public int getProduct (int num1, int num2)

    public int findMaximumProduct() {
        // Local variables to method
        int i, j;                                       // i and j initialized to start at first number in int array
        int numAtI;
        int numAtJ;
        int currentLargestProduct;

        // Check to make sure the int array is not empty
        if (this.getArrayOfNumbers1().length == 0)           // If array is Empty
            return -1;                                     //  return -1 as error

        // Check to see if array only contains one element
        if (this.getArrayOfNumbers1().length == 1)
            this.setLargestProduct(this.getArrayOfNumbers1()[0]);

            // Multiply the largest two elements of the array which if sorted would be the first two elements to get largest product
        else {
            // Sort the array of numbers by their "natural order"
            int[] sortedArray = this.getArrayOfNumbers1();
            Arrays.sort(sortedArray);

            // Create variables for indexes od last element and second to last element of sorted array
            int nextToLastIndex = sortedArray.length - 2;
            int lastIndex = sortedArray.length -1;

            // Set this instance variable for largest product to the product of the first two elements of sorted array
            this.setLargestProduct(this.getProduct(sortedArray[nextToLastIndex], sortedArray[lastIndex]));

            //RETURN Maximum Product of two numbers in the int Array
            return this.getLargestProduct();
        }//END else
        return this.getLargestProduct();
    }//END public int findMaximumProduct()

    /**
     *
     * @param anArray1
     * @param anArray2
     * @return
     */
    public int findMaximumProduct(int[] anArray1, int[]anArray2) {
        // Local variables to method
        int[] array1 = anArray1;
        this.setArrayOfNumbers2(anArray2);
        int[] array2 = anArray2;
        int currentLargestProduct = -1; // Initializes this.largestProduct to -1 since no value for this is passed as a parameter.

        // Check to make sure that neither of the int arrays received as parameters are empty
        if (
                (anArray1.equals(null)) ||          // If array is empty.
                        ( anArray2.equals(null) )  // If array is empty.
        )
            return -1;                                          // return -1 as error.

            // Multiply the largest two elements of the array which if sorted would be the first two elements to get largest product
        else {
            // Sort the array of numbers by their "natural order"
            int[] sortedArray1 = this.getArrayOfNumbers1();
            Arrays.sort(sortedArray1);

            int[] sortedArray2 = this.getArrayOfNumbers2();
            Arrays.sort(sortedArray2);


            // Create variables for indexes od last element and second to last element of sorted array
            int lastIndexOfArray1 = sortedArray1.length - 1;
            int lastIndexOfArray2 = sortedArray2.length - 1;

            // Set this instance variable for largest product to the product of the first two elements of sorted array
            this.setLargestProduct(this.getProduct(sortedArray1[lastIndexOfArray1], sortedArray2[lastIndexOfArray2]));

            //RETURN Maximum Product of two numbers in the int Array
            return currentLargestProduct;
        }//END else

    }//END public int findMaximumProduct(int[] anArray1, int[]anArray2) {

    public int[] getArrayOfNumbers1() {
        return this.arrayOfNumbers1;
    }

    public void setArrayOfNumbers1(int[] arrayOfNumbers1){
        this.arrayOfNumbers1 = arrayOfNumbers1;
    }

    public int getSizeOfArray () {
        return sizeOfArray;
    }

    public void setSizeOfArray ( int sizeOfArray){
        this.sizeOfArray = sizeOfArray;
    }

    public int getaProduct () {
        return aProduct;
    }

    public void setAProduct ( int aProduct){
        this.aProduct = aProduct;
    }

    public int getLargestProduct() {
        return largestProduct;
    }

    public void setLargestProduct ( int largestProduct){
        this.largestProduct = largestProduct;
    }

    public int[] getArrayOfNumbers2() {
        return arrayOfNumbers2;
    }

    public void setArrayOfNumbers2(int[] arrayOfNumbers2) {
        this.arrayOfNumbers2 = arrayOfNumbers2;
    }
}//END Class ProductMaximizer

