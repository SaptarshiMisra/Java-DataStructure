package Arrays.easy;

public class MoveZeroesToEnd {

	public MoveZeroesToEnd() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * O(N) with two pointers
	 */
	private static int[] moveZeroesToEnd(int[] input) {
		
		int i=0, j=input.length-1;
		while(i<j) {
			if(input[i] == 0) {
				//swap
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				j--;
			}
			i++;
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,0,2,0,3,0,4,5,6};
		System.out.println("All zeroes to right" + new ArrayToStringPrinter().print(moveZeroesToEnd(input)));
	}
}
