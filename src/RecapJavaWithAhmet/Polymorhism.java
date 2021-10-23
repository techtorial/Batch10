package RecapJavaWithAhmet;

public class Polymorhism {
    //POSSIBLE INTERVIEW QUESTION:
    //1)WHAT IS POLYMORPHISM?
    //2)WHAT IS DYNAMIC AND STATIC POLYMORPHISM?

    //POLYMORPHISM: is the different forms of the object.
    //LIST<String> name = new ArrayList<>();
    //ArrayList<String> name1 = new ArrayList<>()
    //2) DYNAMIC POLYMORPHISM: it occurs in a runtime.
    //*) overriding methods are dynamic polymorphism (you do your own implementation)
    //   Static POLYMORPHISM : it occurs in a compile time(you do not your own implementation)

    public static void main(String[] args) {
        int [] number = {1};
        for(int i = 0; i< number.length;i++){
            System.out.println(number[2]);
        }
    }
}
