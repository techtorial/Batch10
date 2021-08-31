package String;

public class Methods4 {
    public static void main(String[] args) {


        String a = "John";

        String b = "John";

        boolean bl1 = a.equals(b); //--> true
        System.out.println(bl1);

        boolean bl2 = a.equals("John"); //--> true
        System.out.println(bl2);

        String c = "JOHN";

        boolean bl3 = a.equals(c); // --> false
        System.out.println(bl3);

        //==============
        //equalsIgnoreCase()

       boolean bl25 =  a.equalsIgnoreCase(c); // true
        System.out.println(bl25);

        System.out.println("Java is".equalsIgnoreCase("JAVA is")); // true

        System.out.println("Java is".equalsIgnoreCase("Java is")); // true
        System.out.println("Java is cool".equalsIgnoreCase("JAVA is")); // false


        // Diana is here // Diana IS HERE // Diana Is Here // diana is here // DIANA IS HERE

        String str1 = "Java is cool";

        // replace(), it will replace original value with new one

        str1 = str1.replace('o', '$');
        System.out.println(str1);

        str1 = str1.replace("c$$l", "easy");
        System.out.println(str1);
        String text1 = "Tava";

        str1 = str1.replace("Java", text1);
        System.out.println(str1);

        System.out.println(str1.replace("***", "???"));
        String star = "Star of the day is *";
        System.out.println(star.replace("*", "$$$"));

        //===================trim()=========

        String text2 = "                 It is Saturday  ";

        System.out.println(text2);

        text2 = text2.trim();
        System.out.println(text2);

        // "Do whatever it takes"
        /*
       - concat with "to learn Java"
       - make everything to uppercase
       - replace "Java" with "JOB"
        - check if the text contains "Chicago"

         */
        String string = "Do whatever it takes ";

        string = string.concat("to learn Java");
        string = string.toUpperCase();
        string = string.replace("JAVA", "JOB");

        System.out.println("does it contain Chicago-->"+(string.contains("Chicago")));
        string = string.replace("LEARN", "GET");

        System.out.println(string);

    }
}
