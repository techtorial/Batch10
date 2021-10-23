package MentoringAhmet;

import java.util.*;


public class testing {
    static int a=5;
    int b =4;
    public static void main(String[] args) {
        System.out.println("hello");
        testing testing = new testing();
        testing testing2 = new testing();
        testing testing3 = new testing();
        testing testing4 = new testing();
        testing testing5 = new testing();


//AUTOBOXING
        int a = 5; // this is autoboxing because it converts from int
        // to object (because list only stores object


        List<Integer> list = new ArrayList<>();
        list.add(a); //
        list.get(a);

        int b = (int)list.get(a); // unboxing
    }
     testing(){// you cannot make the constructor
        // final or static because you cannot OVERRIDE the final
        //and static
    }
    static {
        System.out.println("I am a static ");
    }
    {
        System.out.println("I am a instance");
    }
    static{
        System.out.println("I am a send static");
    }
    void testing(){

    }
}
