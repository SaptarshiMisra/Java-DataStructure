package sort;

public class BubbleSort extends ArrayPrintUtils {
    public static void main(String[] args) {
        int[] data = {5,4,3,2,1,100,56,45,234,657,12345,567};
        int[] sorted = bubbleSort(data);
        ArrayPrintUtils.printIntArray(sorted);

    }
    static int[] bubbleSort(int[] input){
        int in,out;
        for(out = input.length-1; out >=1 ; out --){
            for (in = 0; in < out; in++) {
                if(input[in]>input[in+1]){
                    ArrayPrintUtils.swap(input,in,in+1);
                }
            }
        }
        return input;
    }

}
