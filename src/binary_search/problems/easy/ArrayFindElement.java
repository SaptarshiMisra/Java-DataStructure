package binary_search.problems.easy;

import binary_search.util.Utils;

import java.util.Arrays;

public class ArrayFindElement {
    private boolean isElementExists(int[] input, int searchElement){
        int start = 0, end =input.length-1;
        while (start <= end){
            int mid = (start + end )/2;
            if(input[mid] == searchElement) return true;
            if(input[mid] < searchElement){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = Utils.prepareEVenSizedIntArray();
//        System.out.println("Input array is "+ Arrays.toString(input));
        final int searchElement = 99999999+1;
        System.out.print("Searching for "+ searchElement);
        System.out.println(" is "+  new ArrayFindElement().isElementExists(input, searchElement));
    }
}
