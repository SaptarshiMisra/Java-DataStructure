package sort;
public class QuickSort{

  private int [] input;
  public QuickSort(int[] input){
    this.input = input;
  }

  public void doQuickSort(){

    int left = 0;
    int right = this.input.length -1;
    quickSort(left, right);
    
  }
  private void quickSort(int left, int right){
    while(left <= right){
      int pivot = left+((right-left)/2);
      int index = partition(left,right,pivot);
      quickSort(left,index-1);
      quickSort(index+1, right);
    }
  }
  private int partition(int left, int right, int pivot)
  {
    while(left <= right)
    {
      while(this.input[left]< pivot)
        {
          left ++;
        }
      while(this.input[right] > pivot)
        {
          right --;
        }
      if(left <= right)
      {
        swap(left, right);
        left ++;
        right --;
      }
    }
    return left;
  }
  private void swap(int left, int right)
  {
    int temp = this.input[left];
    this.input[left] = this.input[right];
    this.input[right] = temp;
  }
  public void printSortedArray()
  {
    for(int i=0; i<this.input.length;i ++){
      System.out.print(this.input[i]+" ");
    }
  }
  public static void main(String[] args){
    int[] inp = {5,3,4,1,2,9,6,8,7};
    QuickSort obj = new QuickSort(inp);
    obj.doQuickSort();
    obj.printSortedArray();
  }
}