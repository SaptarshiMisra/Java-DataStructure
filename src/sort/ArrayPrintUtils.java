package sort;

public class ArrayPrintUtils {
    public static void printIntArray(int[] input){
        for (int each: input) {
            System.out.println(each +" ");
        }
    }
    public static void swap(int[] input, int from, int to){
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }
}
