package Arrays.subarrays;

public class MaxSubArraySum {

    // O(n^3) TC,
    public static int getMaxSubArraySum(int[] input){
        // initialize max sum
        int maxSubArraySum = Integer.MIN_VALUE;
        //max size possible n*n+1 / 2: represented by sub array count sRowCount
        int[][] subArrays = new int[(input.length*(input.length+1))/2][input.length];
//        subArrays = new int[][]{{-1}, {-1, 4}, {-1,4,7}};
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += input[k];
                }
                if(sum > maxSubArraySum) maxSubArraySum=sum;
            }
        }
        return maxSubArraySum;
    }


    //O(n^2)
    public static int getMaxSubArrayInQuadraticComplexity(int[] input){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int j = i; j <  input.length; j++) {
                sum += input[j];
                if( sum > maxSum ) maxSum = sum;
            }
        }
        return maxSum;
    }

    //O(n) using kadane's algorithm
    public static int getMaxSubArraySumUsingKadaneAlgo(int[] input){
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if (sum > maxSum ) maxSum = sum;
            if( sum< 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input = {-1,4,7,2};
        System.out.println("Max Sub Array Sum in O(n^3) is "+ getMaxSubArraySum(input));
        System.out.println("Max Sub Array Sum in O(n^2)  is "+ getMaxSubArrayInQuadraticComplexity(input));
        System.out.println("Max Sub Array Sum in O(n) using Kadane's Algorithm  is "+ getMaxSubArraySumUsingKadaneAlgo(input));
    }
}
