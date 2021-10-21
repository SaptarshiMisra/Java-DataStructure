package tree;

public class Tree{

  private Tree left, right;
  private int data;

  public Tree(int data){
    this.data = data;
  }

  private void insert(int newData){
    if(newData < data){
      if(this.left == null){
        this.left = new Tree(newData);
      }else{
        this.left.insert(newData);
      }
      
    }else{
      if(this.right == null) this.right = new Tree(newData);
      else{
        this.right.insert(newData);
      }
    }
  }
  
  private void inOrderTraversal(){
    if(null != this.left)
      this.left.inOrderTraversal();
    System.out.print(this.data+" ");
    if(null != this.right)
      this.right.inOrderTraversal();
  }

  public static void main(String[] args){
    Tree bTree = new Tree(5);
    bTree.insert(1);
    bTree.insert(3);
    bTree.insert(6);
    bTree.insert(4);
    bTree.insert(2);

    bTree.inOrderTraversal();
  }
}
