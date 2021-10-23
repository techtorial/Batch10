package MentoringAhmet;

public class Test {
    public static void main(String[] args) {

        String name = "Ahmet";
        String name1= new String("Ahmet");
        String name2 = "Ahmet";
        String name3= new String("Ahmet");
//== it compares the location of the value(String pool)
        System.out.println(name==name2); // true
        //.equals it only checks the value of the variable
        System.out.println(name.equals(name2));//true
        System.out.println(name==name1);//false
        System.out.println(name.equals(name1));//true
        System.out.println(name1==name3);//false
        System.out.println(name1.equals(name3));//true

        String example = "Mehmet";
        example=example.concat("loves Java");
        StringBuilder example2= new StringBuilder("Mehmet");
        example2.append("loves java");
        System.out.println(example); // Mehmet
        System.out.println(example2); // Mehmet loves java
         
        //DIFFERENCE BETWEEN STRING BUILDER AND BUFFER
        //THe main difference is ALL ABOUT synchrization / thread safe  **
        //Could you tell me what you mean synchrization / thread safe
        //in my mind it means first come first serve
        //it waits for the perform(action one by one)
        //String Buffer is synchriniza and slow and thread safe
        //String Builder is not synchronized. it is fast and not thread safe
        //HashTable is also synchronized
        
    }
}
