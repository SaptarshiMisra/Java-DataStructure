package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.datastructure.utils.InputListSize;
import linkedlist.datastructure.utils.Util;

public class NthNodeFromEndOfList {
    //idea is to use two pointers
    // fast pointer should be ahead by "n" than the slow pointer

    public Node getNthNode(int n, LinkedList inputList){
        int i =0,j =i+n;
        while(j< inputList.size()){
            j += 1;
            i +=1 ;
        }
        Node nthNode = inputList.get(i);
        return nthNode;
    }

    public static void main(String[] args) {
        LinkedList inputList = Util.prepareInput(InputListSize.EVEN);
        System.out.println("Input list "+inputList);
        System.out.println("5th from last is "+ new NthNodeFromEndOfList().getNthNode(5,inputList).getValue());
    }
}
