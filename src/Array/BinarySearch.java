package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary Search
// binary search will return index number if the element is present in the array
// if the element is not in the array, it will return possible element position with negative sign
 // you need to sort the array before you apply binary search

        int[] studentNumber = {100,10,15,20,30,35};
       //  [10, 15, 20, 30, 35, 100]

        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber, 35));
        System.out.println(Arrays.binarySearch(studentNumber,25));
        System.out.println(Arrays.binarySearch(studentNumber,150));
        System.out.println(Arrays.binarySearch(studentNumber,111)); // -7
        System.out.println(Arrays.binarySearch(studentNumber,49)); // -6



















//        String string = "Java";
//
//        System.out.println(string.indexOf("a")); // index number of first a --> 1

    }
}
