package day20CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args){
        List<Integer> intList=new Vector<>();

        //adding data
        intList.add(4);
        intList.add(1);
        intList.add(17);
        intList.add(4);
        intList.add(9);
        intList.add(3);
        intList.add(null);

        //printing data
        System.out.println(intList);
    }
}

/**Output:
 * for ArrayList:
 * Duplicates: Allowed
 * Null values: Allowed
 * Order: Inserted order
 *
 * for LikedList:
 * Duplicates: Allowed
 * Null values: Allowed
 * Order: Inserted order
 *
 * for Vector:
 * Duplicates: Allowed
 * Null values: Allowed
 * Order: Inserted order
 */