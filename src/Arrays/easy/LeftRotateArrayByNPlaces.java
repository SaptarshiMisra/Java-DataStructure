package Arrays.easy;

public class LeftRotateArrayByNPlaces {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};//op: if n=3, 4,5,6,7,8,1,2,3

        System.out.println("After rotation " + new ArrayToStringPrinter().print(leftRotateByNplaces(input,3)));
    }

    private static int[] leftRotateByNplaces(int[] input, int rotateByPlace) {
        if(input.length == 1) return input;
        //reverse the array between 0 - n
        int i=0,j=rotateByPlace   cccccccccccc      ;
        //reverse n+1 - array.length

        //reverse the whole array

        return input;
    }
}
