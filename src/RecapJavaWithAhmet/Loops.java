package RecapJavaWithAhmet;

import java.util.Scanner;

public class Loops {
    /*
    Loop is defined as a cyle it means the action repeats
    unless condition is true.

    1)DO WHILE
    2)WHILE
    3)FOR
    4)FOR EACH
     */
    public static void main(String[] args) {
        int x =6;
        int y = 7;
        do{
            System.out.println("hello ");
            y--;
        }while(y<x);
        int choice ;
//        do{
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Please enter the number\n1)Enter" +
//                    "\n2)Exit");
//            choice=scan.nextInt();
//
//        }while(choice!=2);

        //FOR THIS KIND OF QUESTION I REALLY WANT TO USE WHILE LOOP
        // int number = 123456;
        //sum of digit and multiplication of the digit
        // 21  // 720
         int number = 123456; //123456/10 --> 12345  1234 123 12 1 0
         int sum=0;
        while(number!=0){
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        System.out.println(sum);

        int number1 = 123456; //123456/10 --> 12345  1234 123 12 1 0
        int sum1=1;
        while(number1!=0){
            int digit = number1%10;
            sum1*=digit;
            number1/=10;
        }
        System.out.println(sum1);

        String word = "Please reverse me";
        String reverse ="";
        for(int i = word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
        String word1 = "Please reverse me";
        String result="";
        boolean isMatching;

        for(int i = 0;i<word1.length();i++){
            isMatching=false;
            for(int j = i+1;j<word1.length();j++){
                if(word1.charAt(i)==word1.charAt(j)){

                    isMatching=true;
                }

            }
            if(isMatching&&!result.contains(""+word1.charAt(i))&&word1.charAt(i)!=' '){
                result+=word1.charAt(i);
            }

        }
        System.out.println("results " +result);



        String output = "";
        for (int i = 0; i < word.length(); i++) {
            if (!output.contains(""+word.charAt(i))) {
                for (int j = i+1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        output += word.charAt(j)+",";
                        break;
                    }
                }
            }
        }
      //  System.out.println(output);
    }
    //***NESTED LOOPS
    //find the dublicate letters // nested loop

    //output --> e,s,r,




}
