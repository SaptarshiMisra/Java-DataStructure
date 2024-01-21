package binary_search.util;

public class Utils {
    public static int[] prepareEVenSizedIntArray(){
        final int arrayLength = 100000000;
        int[] returnArray = new int[arrayLength+1];
        for (int i = 0; i <= arrayLength; i++) {
            returnArray[i] = i;
        }
        return returnArray;
    }
    public static int[] prepareSmallEvenSizedIntArray(){
        final int arrayLength = 100;
        int[] returnArray = new int[arrayLength+1];
        for (int i = 0; i <= arrayLength; i++) {
            returnArray[i] = i;
        }
        return returnArray;
    }
}
