package MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfo {

    public static void main(String[] args) {

        HashMap <String, String> student1  = new HashMap<>();

        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender","M");
        student1.put("City","Chicago");

        HashMap <String, String> student2  = new HashMap<>();

        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age","15");
        student2.put("Gender","M");
        student2.put("City","HigPark");

        HashMap <String, String> student3  = new HashMap<>();

        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "12");
        student3.put("Gender","M");
        student3.put("City","Winnetka");

        HashMap <String, String> student4  = new HashMap<>();

        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender","F");
        student4.put("City","Chicago");

        List<HashMap<String, String>> studentList = new ArrayList();

        studentList.add(student1); studentList.add(student2); studentList.add(student3);studentList.add(student4);

        System.out.println(studentList);

        // if student's city is 'Chicago' create an email address as 'name+chicago@gmail.com'


        for (int i=0; i < studentList.size(); i++){

            if (  studentList.get(i).get("City").equals("Chicago")     ){

                System.out.println(    studentList.get(i).get("FirstName").concat("Chicago@gmail.com")     );
            }

        }


        System.out.println("=========================================");
























        // if student's age is less than 20 show their name

        for (int i = 0; i < studentList.size(); i++){

            if (Integer.parseInt(studentList.get(i).get("Age")) < 20 ){

                System.out.println(studentList.get(i).get("FirstName"));
            }

        }
        // print out elements from map as pairs key-value

        for (int i = 0; i< studentList.size(); i++){

//            for (HashMap<String, String> map: studentList){
//                System.out.println(map.entrySet());
//            }
            System.out.println( studentList.get(i).entrySet());
        }
    }
}
