package Array;

import java.util.Arrays;

public class MultiDimentional1 {

    public static void main(String[] args) {

        int[][] numbers = new int[3][4];

        numbers[0][0] = 11;
        numbers[0][1] = 22;
        numbers[0][2] = 33;
        numbers[0][3] = 44;
        numbers[2][3] = 99;
      //  numbers[3][0] = 111; //ArrayIndexOutOfBoundsException
        System.out.println(numbers[0][0]); // 11
        System.out.println(numbers);
        System.out.println(numbers[0][3]); // 44
        System.out.println(numbers[2][3]); // 99

        System.out.println(Arrays.toString(numbers));// toString() method will print out hash code for multidimensional array
        System.out.println(Arrays.deepToString(numbers));// [[11, 22, 33, 44], [0, 0, 0, 0], [0, 0, 0, 99]]

        for (int i=0;i<numbers.length;i++){

            for (int j=0; j< numbers[i].length ;j ++ ){

                System.out.println(numbers[i][j]);
            }

        }
    }
}
