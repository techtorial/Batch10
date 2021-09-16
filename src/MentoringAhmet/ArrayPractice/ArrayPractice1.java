package MentoringAhmet.ArrayPractice;

public class ArrayPractice1 {
    //int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93}
    //find the sum of  even and odd number from array and get the difference between them (odd-even)

    public static void main(String[] args) {
        int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
        int sumofEven=0;
        int sumofOdd=0;

    //i have to iterate the all numbers
        //i need to use loop
        for(int number:array){
            //i need to put a condition for even or odd number
            if(number%2==0){
               // System.out.println("this is a even number");
                sumofEven+=number;
            }else{
                sumofOdd+=number;
            }
        }
        System.out.println(sumofOdd-sumofEven);
    }
}
