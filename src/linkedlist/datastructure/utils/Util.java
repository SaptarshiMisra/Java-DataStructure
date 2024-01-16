package linkedlist.datastructure.utils;

import linkedlist.datastructure.LinkedList;

public class Util {
    public static LinkedList prepareInput(InputListSize listSize){
        LinkedList returnList = null ;
        int sizeBoundry = 0;
        switch(listSize){
            case ODD: sizeBoundry = 5;
            case EVEN: sizeBoundry = 6;
            default: sizeBoundry = 5;
        }
        for (int i = 0; i < sizeBoundry; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                continue;
            }
            returnList.add(i);
        }
        return returnList;
    }

}
