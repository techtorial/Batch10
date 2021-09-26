package WrapperClass;

public class StringToWrapper {

    public static void main(String[] args) {

        String str1 = "54321";

        Integer i1 = Integer.valueOf(str1);
        System.out.println(i1);

        String str2 = "5.9f";

        Float fl1 = Float.valueOf(str2);
        System.out.println(fl1);


        String str3 = "False";
        Boolean bl1 = Boolean.valueOf(str3);
        System.out.println(bl1);

        String str4 = "c";

       // Character.valueOf(str4); compile time error you can not canvert string value to Character object


    }

}
