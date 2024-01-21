package binary_search.problems.easy;

import binary_search.util.Utils;

import java.math.BigInteger;

public class ArrayFloorSqrtNumber {
    // This approach is assuming that problem needs to find sqrt from an array
    //
    private int getSqrtClosest(int[] input, int squaredNumber){
        if(squaredNumber <0) return -1;
        int start =0, end= input.length-1;
        int nearestSqrtNum = -1;
        while(start<= end){
            int mid = (start + end)/2;
            java.math.BigInteger squaredMid = BigInteger.valueOf(input[mid] *input[mid]);
            if(squaredMid.compareTo(BigInteger.valueOf(squaredNumber)) == 0) return input[mid];
            if( squaredMid.compareTo(BigInteger.valueOf(squaredNumber )) < 0){
                start = mid +1;
                nearestSqrtNum = input[mid];
            }
            else{
                end = mid-1;
            }
        }
        return nearestSqrtNum;
    }

    //GFG solution is better, which only uses the target squared num
    private int floorSqrt(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;

        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x / 2, ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            // If x is a perfect square
            if (mid * mid == x)
                return (int)mid;

            // Since we need floor, we update answer when
            // mid*mid is smaller than x, and move closer to
            // sqrt(x)
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            }
            else // If mid*mid is greater than x
                end = mid - 1;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int[] input = Utils.prepareSmallEvenSizedIntArray();
        int squaredNumber = 99;
        System.out.println("Nearest sqrt number is "+new ArrayFloorSqrtNumber().getSqrtClosest(input,squaredNumber));
        System.out.println("Floor sqrt number is "+new ArrayFloorSqrtNumber().floorSqrt(squaredNumber));
    }
}
