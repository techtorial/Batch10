package RecapJavaWithAhmet;

import java.util.Arrays;

public class Array {
    //Array --> fixed size you have to define the size
    //at the beginning;
    //it doesn't have methods
    //int[] array = new int[4];
    //String[] name = {"dasd","asdas"}



    public static void main(String[] args) {
        int [] numbers =new int[3];
        numbers[0]=1;
        System.out.println(numbers);//hashcode
        System.out.println(Arrays.toString(numbers));//1,0,0
        int[] number2= {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int num : number2){
            sum+=num;
        }
        System.out.println(sum);

        ///print out each of the word and reverse them
        String name = "Hi guys how are you";
        //iH
        // syug
        // woh
        // era
        // uoy
        String name1 = "Hello Java is so cool";
        String[] words =name.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = 0 ;i< words.length;i++){
            String reverse="";
            for(int k=words[i].length()-1;k>=0;k-- ){
                reverse+=words[i].charAt(k);
            }
            //  System.out.println(reverse.charAt(0));
            //  System.out.println(reverse.charAt(reverse.length()-1));
            System.out.print(reverse+",");

        }

    }
    }

