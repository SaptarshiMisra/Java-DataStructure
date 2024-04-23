package Arrays.subarrays;

import util.TwoDArrayToStringPrinter;

public class PrintAllSubArrays {
    public static int[][] getSubArrays(int[] input){

        //max size possible n*n+1 / 2: represented by sub array count sRowCount
        int[][] subArrays = new int[(input.length*(input.length+1))/2][input.length];
//        subArrays = new int[][]{{-1}, {-1, 4}, {-1,4,7}};
        int sRowCount = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int r = 0;
                int[] row = new int[j-i+1];
                for (int k = i; k <= j; k++) {
                    row[r++] = input[k];
                }
                subArrays[sRowCount++] = row;
            }
        }

        return subArrays;
    }

    public static void main(String[] args) {
        int[] input = {-1,4,7,2};
        System.out.println(new TwoDArrayToStringPrinter().print(getSubArrays(input)));
    }
}
