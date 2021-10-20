package RecapJavaWithAhmet;

public class StringAndMethods {

    /*
    String --> String is an object
    METHODS:
    1)substring-->it takes specific spot from the string
    2)indexOf() --> it return int the index number
    3)length()-->it returns int the length
    4)equals()--> it returns boolean
    5)equalIgnoreCase()--> it returns boolean but ignores the case
    6)Upper and LoweCase --> it returns String
    7)contains --> it returns boolean
    9)StartsWith and EndsWith --> it returns boolean
    10)CharAt() --> it returns char -->""
    11)replace()--> it returns String
    12)concat() -- > it returns String
    13)trim() --> it returns String without any space

     */
    public static void main(String[] args) {
        String example = "Ahmet loves java";
      // example= example.substring(1);//hmet loves java
        String example1=example.substring(1,2);// h,m,k,e,st reytwegwer,
        System.out.println(example);
        System.out.println(example1);
        int index = example.indexOf('A');
        System.out.println(index);
        int size = example.length();
        System.out.println(size);
        boolean ismatching=example.equals("Ahmet love java");
        boolean ismatching2=example.equalsIgnoreCase("AhmeT loveS jaVa");
        System.out.println(ismatching);//false
        System.out.println(ismatching2);//true
        example=example.replace('a','x');
        System.out.println(example);



    }
}
