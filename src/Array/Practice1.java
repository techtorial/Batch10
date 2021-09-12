package Array;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        int [] numbers = new int[5];

        System.out.println(numbers);

        numbers[0] = 11;
        System.out.println(numbers);
        System.out.println(numbers[0]);// 11
        System.out.println(numbers[1]); // 0
        numbers[1]= 22;
        numbers[4]= 44;
        System.out.println(numbers[4]);// 44

      //  numbers[5]= 55; // it will give ArrayIndexOutOfBoundsException since there is no 5th index
     //   System.out.println(numbers[5]); // it will give ArrayIndexOutOfBoundsException since there is no 5th index
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);


        for (int i=0;i < numbers.length;i++ ){

            System.out.println("from for loop>> "+numbers[i]);

        }

    }
}
