package binary_search.Arrays.medium;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    private int[] multipliedAllArrayNumbers(int[] input){
        int mulAllNumbers = 1;
        for(int i=0; i<input.length; i++){
            if(input[i] == 0) continue;
            mulAllNumbers = mulAllNumbers*input[i];
        }
        for(int i=0;i<input.length;i++){
            if(input[i] == 0){
                continue;
            }
            input[i] = mulAllNumbers / input[i];
        }
        return input;
    }
    private int[] productArrayWithoutDivision(int[] input){

        //Algorithm:
            // Input: arr[]  = {1, 2, 3, 4, 5}
            // prod[]  = {120, 60, 40, 30, 24 }

        //Create an array product and initialize its value to 1 and a variable temp = 1.
            //Traverse the array from start to end.
            //For every index i
                // update product[i] as product[i] = temp
                // and temp = temp * array[i], i.e store the product upto i-1 index from the start of array.

            //initialize temp = 1
                // and traverse the array from last index to start.
            //For every index i
                // update product[i] as product[i] = product[i] * temp
                // and temp = temp * array[i], i.e multiply with the product upto i+1 index from the end of array.
            //Print the product array.
        int temp = 1;
        int[] product_prefix = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            product_prefix[i] = 1;
        }
        temp =1;

        for (int i = 1; i < input.length; i++) {
            product_prefix[i] = temp;
            temp *= input[i];
        }
        int[] product_postfix = new int[input.length];
        for (int i = input.length-1; i > 0; i--) {
            product_postfix[i] = temp * input[i];
        }

        return input;
    }

    void productArrayGFG(int arr[], int n)
    {

        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }

        int i, temp = 1;

        /* Allocate memory for the product array */
        int prod[] = new int[n];

        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++)
            prod[j] = 1;

        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return;
    }
    private int[] productArrayMySoln(int[] nums){
        int productArr[] = new int[nums.length];
        // fill the prod array with 1
        for (int i = 0; i < nums.length; i++) {
            productArr[i] = 1;
        }
        int temp =1;
        for (int i=0; i < nums.length; i++) {
            productArr[i] = temp;
            temp = temp * nums[i] ;
        }
        temp = 1;
        for(int i = nums.length-1 ; i>= 0; i--){
            productArr[i] = productArr[i] * temp;
            temp = temp * nums[i] ;
        }
        return productArr;
    }
    public static void main(String[] args) {
        int[] input ;
//        input = Utils.prepareProductMultiplyArray();
        input = new int[]{10, 3, 5, 6, 2};
        System.out.println("Input array "+Arrays.toString(input));

        System.out.println("GFG Solution ");
        new ProductArrayExceptSelf().productArrayGFG(input, input.length);
        System.out.println("My solution "+Arrays.toString(new ProductArrayExceptSelf().productArrayMySoln(input)));
    }
}
