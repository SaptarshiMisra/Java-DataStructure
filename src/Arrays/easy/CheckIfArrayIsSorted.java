package Arrays.easy;

public class CheckIfArrayIsSorted {

    public static boolean isArraySorted(int[] input){

        if(input.length==1) return false;
        int i=1;
        while(i<input.length-1){
            if(!(input[i]<input[i+1])) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,2,7,8};
        System.out.println("Array is sorted "+isArraySorted(input));
    }
}
