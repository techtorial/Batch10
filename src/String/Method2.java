package String;

public class Method2 {
    public static void main(String[] args) {

        String name = "Diana";
        // indexOf
        System.out.println(name.indexOf('D')); // index number of 'D' --> 0
        System.out.println(name.indexOf("D")); // index number of 'D' --> 0
        System.out.println(name.indexOf("Di")); // // index number of 'D' --> 0
        System.out.println(name.indexOf("ana")); // 2 it looks for matching sequence of provided
        // chars and returns first matching char's index number
        System.out.println(name.indexOf("tina")); // -1 there is no matching char sequence
        System.out.println(name.indexOf("k")); // -1 there is no matching char
        System.out.println("this is saturday morning");

        name = name.concat(" Bejan");

        System.out.println(name); // Diana Bejan

        System.out.println(name.indexOf("a", 3));
        ; // --> it will start looking for
        // that char starting from given index

        System.out.println(name.indexOf("B", name.indexOf(" "))); // Arzu Beril Sen

        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("e", 7));
        System.out.println(name.indexOf("e", name.indexOf(" ")+3)); //


        name.indexOf(2); // values that you are giving inside of the method parentheses are called parameters
        // some methods take no parameters, some take single parameter or multiple parameters
        name.length(); // --> no parameters
        name.charAt(3); // single parameter
        name.indexOf("e",4);// You can pass either one or two parameters by separating them with comma


    }
}
