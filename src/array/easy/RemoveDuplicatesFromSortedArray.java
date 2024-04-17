package array.easy;

import binary_search.util.Utils;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] input = {1,2,2,2,3,4,5,5,6}; // 1,2,3,4,5,6
        System.out.println("Array without duplicates "+ new ArrayToStringPrinter().print(removeDupicates(input)));
    }

    private static int[] removeDupicates(int[] input) {
        if(input.length <=2 ) return input;
        int i=0,j=i+1;
        while (j< input.length){
            if(input[i] != input[j]){
                i = j;
                j++;
            }else{
                input[j] = -1;
                j++;
            }
        }
        return input;
    }

}
