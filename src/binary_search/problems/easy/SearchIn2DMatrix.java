package binary_search.problems.easy;

//You are given an m x n integer matrix matrix with the following two properties:
//  Each row is sorted in non-decreasing order.
//  The first integer of each row is greater than the last integer of the previous row.

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]],
// target = 3
//Output: true

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]],
// target = 13
//Output: false
//Constraints:
//  m == matrix.length
//  n == matrix[i].length
//  1 <= m, n <= 100
//  -104 <= matrix[i][j], target <= 104

import java.util.Arrays;

public class SearchIn2DMatrix {
    private boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length ==0) return false;
        if(matrix.length ==1){
            if(matrix[0].length ==1){
                return matrix[0][0] == target;
            }
        }

        int start =0, end = matrix.length-1;

        while(start <= end){
            int midRow = (start+end)/2;
            int midRowFirstElement = matrix[midRow][0];
            int midRowLastElement = matrix[midRow][matrix[midRow].length-1];

            if( midRowFirstElement == target) {
                start = midRow;
                break;
            }
            if( midRowLastElement == target) {
                start = midRow;
                break;
            }
            // matrix = [
            // [1,3,5,7],[10,11,16,20],[23,30,34,60]
            // [61,62,63,64],[65,66,67,68],[69,70,71,62]
            // ]

            if( target < midRowFirstElement){
                end = midRow -1;
                continue;
            }else if( target < midRowLastElement){
                start = midRow;
                break;
            }
            if(target > midRowLastElement){
                start = midRow +1;
                continue;
            }else if( target > midRowFirstElement ){
                start = midRow;
                break;
            }
        }
        // got the row
        // rowIndex = start
        if(start >= matrix.length) return false;
        if(start == end )
            System.out.println(Arrays.toString(matrix[start]));

        return binarySearchSingleArray(matrix[start], target);
    }

    private boolean binarySearchSingleArray(int[] matrix, int target) {
        int innerStart = 0;
        int innerEnd = matrix.length-1;
        while(innerStart <= innerEnd){
            int mid = (innerStart+innerEnd)/2;
            int midElement = matrix[mid];
            if(midElement == target) return true;
            if(target > midElement) {
                innerStart = mid +1;
            }else{
                innerEnd = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}
        ;
        int search = 11;
        System.out.print("Found "+ search);
        System.out.println(" is "+ new SearchIn2DMatrix().searchMatrix(matrix,search));
    }
}
