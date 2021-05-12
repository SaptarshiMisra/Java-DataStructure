package sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {5,4,3,2,1};
        int[] sorted = insertionSort(data);
        ArrayPrintUtils.printIntArray(sorted);
    }
    static int[] insertionSort(int[] input){
        int in,out;
        for (out=0;out<input.length;out++){
            int head = input[out];
            int headIndex = out;
            for (in = out-1; in >=0 ; in--) {
                int previous = input[in];
                if(head < previous) // swap
                {
                    ArrayPrintUtils.swap(input,in,headIndex);
                    headIndex = in;
                }
            }
        }
        return input;
    }
}
