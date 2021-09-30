package ArrayList;

import Constructor.Car;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList<Integer> list4 = new ArrayList<>();

        ArrayList<Double> list5 = new ArrayList<Double>();

        System.out.println(list2);

        list1.add(0, 99);
        System.out.println(list1);
        // add()
        list2.add(11);
        list2.add("white");
        System.out.println(list2);
        list2.add(22);
        System.out.println(list2);
        list2.add(33);
        System.out.println(list2);    // [11, white, 22, 33]
        list2.add(2, 44);
        System.out.println(list2);    //[11, white, 44, 22, 33]

        // size()

        int list2Size = list2.size();
        System.out.println(list2Size);

        list2.add(5, 66);
        System.out.println(list2);

        //   list2.add(8,88); // IndexOutOfBoundsException

        // get()

        System.out.println(list2.get(3));

        // System.out.println(list2.get(10)); // IndexOutOfBoundsException
        System.out.println(list2.size()); // [11, white, 44, 22, 33, 66]

        //remove()

        list2.remove("white");
        System.out.println(list2);
        list2.remove(1);

        System.out.println(list2);
        list2.remove("66"); // if the element is not on the ArrayList nothing happens/does not remove
        System.out.println(list2);
        list2.add(66);
        list2.remove((Integer) 66); // [11, 22, 33, 66]
        System.out.println(list2);
        // addAll() --> you can add a whole collection to the ArrayList/Collection
        list3.addAll(list2);
        System.out.println("list3>>> " + list3);
        list3.add(77);
        System.out.println(list3);
        // removeAll() ---> you can remove a whole collection from an ArrayList/Collection
        list3.removeAll(list2);
        System.out.println(list3);

        list3.add(88);
        list3.add(100);
        System.out.println(list3);

        // set()

        list3.set(2,  200);
        list3.set(0, 300);

        System.out.println(list3);

        // you can use String methods

        System.out.println(list3.contains(88));
        list3.set(0,"xxxx");

        System.out.println(list3.get(0).toString().startsWith("x"));

        // clear()

        System.out.println(list3);
        list3.clear();
        System.out.println(list3);
        System.out.println(list3.size());
    }
}
