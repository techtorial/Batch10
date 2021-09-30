package ArrayList;

import Constructor.Car;

import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {


        Object[] objects = {2, true, "yes", "no", 2.5, new Car()};


        // How to convert array to ArrayList

        List<Object> list = Arrays.asList(objects);

        System.out.println(list.size());

     //   list.add("new element"); // UnsupportedOperationException
        System.out.println(list);
     //   list.remove("yes"); //// UnsupportedOperationException
        System.out.println(list);

        List<Object> list1 = Arrays.asList(1,2,3,4,true);
        System.out.println(list1);

        //list1.add(5); UnsupportedOperationException
        list1.set(0,100);
        System.out.println(list1);
    }
}
