package MentoringAhmet.InterviewQuestion;

import java.util.Arrays;

public class SwitchingWord {
    public static void main(String[] args) {

        //switch the pairs

        String[] array={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
        //flowers , four , eleven, sun better , cloud git

        for(int i = 0; i<array.length-1;i++){
            String temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            i++;

        }
        System.out.println(Arrays.toString(array));
        String[] array3={"2", "1", "4", "3", "6", "5", "7"};
        //1,2,3,4,5,6,7
        for(int k = 0; k< array3.length-1;k+=2){
            String temp2= array3[k];
            array3[k]=array3[k+1];
            array3[k+1]=temp2;
        }
        System.out.println(Arrays.toString(array3));
    }
}
