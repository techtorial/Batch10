package MentoringAhmet.InterviewQuestion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion {
    //what is the difference between array and arraylist;
    /*
    Array=>Fixed size , Synthax, **It doesnt have any methods, length
    ***it stores primitive data and object

    ArrayList = > it is flexible, **it does have methods. **size
    ***it stores only objects

     */
    public static void main(String[] args) {
        String[] array = {"Ahmet","Diana","Elvira","Ramazan","Mr.Z"};
        String[] array1 = new String[2];
        int[] number=new int[3];
        array1[0]="Arzu";
        array1[1]="Nikita";
//        array1[2]="Iulia";
        System.out.println(Arrays.toString(array1));
        ArrayList<String> name = new ArrayList<>();
        name.add("Ahmet");
        name.add("Adam");
        name.add("Tuba");
        name.add("Berry");
        name.add("Maksat");
        name.add("Adel");
        name.add("kana");
        name.add("Bota");
        ArrayList<Integer> number1=new ArrayList<>();
        int age =25;
        number1.add(age);//autoboxing=  you do not need to use any methods
        String number3=String.valueOf(age);//unboxing you need to use methods.

        System.out.println(name);
        //create a method and void sout the name(if it is there)
        //write a java program to search an element in arrayList
    nameSearch(name,"Ahmet");
    }
    ///first key point: I have to access each of the element by using loop
    //I have to get the element from the list and compare it
    public static void nameSearch(ArrayList<String>allnames,String name){
        String searchName =name;
        for(int i = 0; i<allnames.size();i++){
           if( allnames.get(i).equals(searchName)){
               System.out.println("your name is there ");
               break;
           }else{
               System.out.println("Your name is not there");
           }
        }
    }
}
