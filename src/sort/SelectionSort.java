package sort;

public class SelectionSort extends ArrayPrintUtils{
    public static void main(String[] args) {
        int[] data = {5,4,3,2,1};
        int[] sorted = selectionSort(data);
        ArrayPrintUtils.printIntArray(sorted);
    }
    static int[] selectionSort(int[] input){
        // make 0 as sorted
        int min,minIndex;
        //outer loop to mark the sorted index
        for(int out=0; out<input.length-1;out++){
            min=input[out];
            minIndex = out;
            //scanner loop for min
            for(int in= out+1;in<input.length;in++)
            {
                if( input[in] < min ){
                    min = input[in];
                    minIndex = in;
                }
            }
            ArrayPrintUtils.swap(input,out,minIndex);
        }
        return input;
    }
}
