package Arrays.easy;

public class UnionOfTwoSortedArrays {

	public UnionOfTwoSortedArrays() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Input: arr1[] = {1, 3, 4, 5, 6} arr2[] = {2, 3, 5, 7} Output: Union : {1, 2,
	 * 3, 4, 5, 6, 7}
	 */
	private static int[] unionOftwoArray(int[] one, int[] two) {
		int[] outputArray = new int[one.length + two.length];

		int i = 0, j = 0, k = 0;

		while (i < one.length || j < two.length) {

			if (i > one.length - 1) {
				// copy all from two
				while (j < two.length) {
					outputArray[k++] = two[j++];
				}
				break;
			}
			if (j > two.length - 1) {
				// copy all from one
				while (i < one.length) {
					outputArray[k++] = one[i++];
				}
				break;
			}

			if (one[i] != two[j]) {
				if (one[i] < two[j]) {
					outputArray[k++] = one[i++];
				} else {
					outputArray[k++] = two[j++];
				}
			} else {
				outputArray[k++] = one[i];
				i++;
				j++;

			}
		}
		// all elements of arr1 , arr2 were inserted

		return outputArray;
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 15, 20, 30, 40, 60 };
		int arr2[] = { 20 };

		System.out.println("Union of array is " + new ArrayToStringPrinter().print(unionOftwoArray(arr1, arr2)));
	}
}
