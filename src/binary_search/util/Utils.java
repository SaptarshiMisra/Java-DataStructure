package binary_search.util;

public class Utils {
    public static int[] prepareEVenSizedIntArray(){
        return prepareIntArrayWithSize(100000000);
    }
    public static int[] prepareSmallEvenSizedIntArray(){
        return prepareIntArrayWithSize(10);
    }

    public static int[] prepareProductMultiplyArray(){
        return prepareIntArrayWithSizeAndValueStartsOne(5);
    }

    static int[] prepareIntArrayWithSize(int arrayLength) {
        int[] returnArray = new int[arrayLength + 1];
        for (int i = arrayLength; i >= 0; i--) {
            returnArray[i] = i;
        }
        return returnArray;
    }

    static int[] prepareIntArrayWithSizeAndValueStartsOne( int arrayLength) {
        int[] returnArray = new int[arrayLength];
        for ( int i=0 ; i < arrayLength; i++) {
            returnArray[i] = i+1;
        }
        return returnArray;
    }

    public static int[] prepareHIndexInput(){
//        int[] result = {3,0,6,1,5};
        int[] result = {0,0};
        return result;
    }
}
