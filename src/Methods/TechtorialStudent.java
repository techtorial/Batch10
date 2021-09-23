package Methods;

public class TechtorialStudent {
    static String schoolName;
    static String schoolAddress;
    String studentName;
    String studentTableNumber;
    int studentAge;
// In order to instantiate non-static variable in different class
    // I have to create on object

    public void setStudentName(String studentName1) {
        studentName = studentName1;
    }
    public static void setSchoolName(String schoolName1) {
        schoolName = schoolName1;
    }

    public void setStudentTableNumber(String studentTableNumber1) {
        studentTableNumber = studentTableNumber1;
    }

    public void setStudentAge(int studentAge1) {
        studentAge = studentAge1;
    }

    public static void setSchoolAddress(String schoolAddress1) {
        schoolAddress = schoolAddress1;
    }

}
