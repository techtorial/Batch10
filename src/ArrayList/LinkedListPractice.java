package ArrayList;

import java.util.LinkedList;

public class LinkedListPractice {


    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("x");
        list.add("y");
        list.add("z");
        System.out.println(list);

        list.add(2,"t");
        System.out.println(list);

        list.remove("t");
        System.out.println(list);
        Practice2 p = new Practice2();
        Practice2 p1 = new Practice2();
        Practice2 p2 = new Practice2();
        Practice2 p3 = new Practice2();
        LinkedList list1 = new LinkedList<>();

        list1.add(p1);
        list1.add(p2);
        list1.add(p3);

        System.out.println(list1);

     }
}
