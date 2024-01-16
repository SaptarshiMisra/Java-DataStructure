package linkedlist.datastructure.utils;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;

public class Util {
    public static LinkedList prepareInput(InputListSize listSize){
        LinkedList returnList = null ;
        int sizeBoundary = getSizeBoundry(listSize);
        for (int i = 0; i < sizeBoundary; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                continue;
            }
            returnList.add(i);
        }
        return returnList;
    }
    public static LinkedList prepareCircularListInput(InputListSize listSize){
        LinkedList returnList = null ;
        Node startingHead = null;
        int sizeBoundary = getSizeBoundry(listSize);
        for (int i = 0; i < sizeBoundary; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                // this node points to null, will be tail
                startingHead = returnList.getHead();
                continue;
            }
            returnList.add(i);
        }
        //set tail.next = head
        startingHead.setNext(returnList.getHead());
        return returnList;
    }

    private static int getSizeBoundry(InputListSize listSize) {
        int sizeBoundry = 0;
        switch (listSize) {
            case ODD:
                sizeBoundry = 5;
                break;
            case EVEN:
                sizeBoundry = 10;
                break;
//            default: sizeBoundry = 5;
        }
        return sizeBoundry;
    }

}
