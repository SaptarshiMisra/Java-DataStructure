package Arrays.medium;

import util.ArrayToStringPrinter;

/**
 * @author Saptarshi Misra
 *//* Created by SAPTARSHI on 10/5/2024 */
public class DutchNationalFlag {
    private static int[] input = {0,1,1,0,1,2,1,2,0,0,0,1};

    public static void main(String[] args) {
        int[] sortedColors = sortColors(input);
        System.out.println(new ArrayToStringPrinter().print(sortedColors));
    }

    private static int[] sortColors(int[] input){

    int first=0 ,mid = 0;
    int last = input.length -1;

    while (mid<=last){

        if(input[mid] == 0){
            swap(input, first, mid);
            first ++;
            mid ++;
            continue;
        }
        if(input[mid] == 1){
            mid ++;
            continue;
        }

        if (input[mid] ==2){
            swap(input, mid,last);
            last --;
        }
    }

    return input;
}

    private static void swap(int[] input, int first, int second) {
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }
}
