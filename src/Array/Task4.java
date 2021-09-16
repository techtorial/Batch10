package Array;

public class Task4 {
    public static void main(String[] args) {
        /*
            print out the number pairs that their sum is 30
		        {14,21,6,5,74,25,9,84,16}
		hint: nested for loop
		    ex: 14 and 16 makes 30
				21 and 9 makes 30
    */
        int[] numbers = {14,21,6,5,74,25,9,16,15,15};

        for (int i =0; i< numbers.length; i++){

            for (int k = 0; k < numbers.length; k++){

                if (numbers[i]+numbers[k] ==30){
                    System.out.println(numbers[i]+" --"+ numbers[k]);
                }
            }
        }

    }
}
