package Mentoring;

public class HW8Task5 {
    public static void main(String[] args) {
        int number=345678909;
        // To find the last digit of the number we need to find remainder with 10
        // To get rid of last digit you need to divide the number by 10
        for (;number>0;number/=10){
            System.out.print(number%10);

        }
    }
}
