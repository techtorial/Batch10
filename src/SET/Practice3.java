package SET;

import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        // you are given an array of colors
        // find out and store duplicate elements in to an ArrayList from this array

        // String[] colors = {"red", "black", "black", "white", "red", "orange"};

        // eliminate duplicate
        String[] colors = {"red", "black", "black", "white", "red", "orange","red"};
        List list = Arrays.asList(colors);

        HashSet  hashSet = new HashSet(list);

        HashSet  hashSet1 = new HashSet(Arrays.asList(colors));
        System.out.println(hashSet);
        System.out.println(list);

        // find out and store duplicate elements in to an ArrayList from this array

        ArrayList list2 = new ArrayList();
        HashSet set2 = new HashSet();

        for (  String color : colors){

            if (!set2.add(color)){

                list2.add(color);
            }
        }
        System.out.println(list2);
    }
}
