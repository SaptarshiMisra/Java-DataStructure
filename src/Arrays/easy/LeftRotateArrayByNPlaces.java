package Arrays.easy;

public class LeftRotateArrayByNPlaces {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};//op: if n=3, 4,5,6,7,8,1,2,3
//        System.out.println("Reversed array " + new ArrayToStringPrinter().print(reverseArray(input, 3, 8)));
        System.out.println("After rotation " + new ArrayToStringPrinter().print(leftRotateByNplaces(input,3)));
    }

    private static int[] leftRotateByNplaces(int[] input, int rotateByPlace) {
        if(input.length == 1) return input;
        //reverse the array between 0 - n
        reverseArray(input, 0,rotateByPlace);
        //reverse n+1 - array.length
        reverseArray(input, rotateByPlace,input.length);
        //reverse the whole array
        reverseArray(input, 0,input.length);
        return input;
    }

	public static int[] reverseArray(int[] input, int startIndex, int numberOfElementsToBeReversed) {
        /*1234 -
         * i=0 4231, mid = 3/2=1
      	*/
		int j = numberOfElementsToBeReversed-1;
        int mid = (startIndex+numberOfElementsToBeReversed)/2;
        mid = mid%2 ==0 ? mid+1:mid;
        while(startIndex<j) {
        	int temp = input[startIndex];
        	input[startIndex] = input[j];
        	input[j] = temp;
        	startIndex++;
        	j--;
        }
        return input;
	}
}
