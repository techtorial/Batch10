package RecapJavaWithAhmet;

public interface  AbstractInterface {
    String name="ahmet";
    //POSSIBLE INTERVIEW QUESTION:
    //WHAT IS THE DIFFERENCE BETWEEN ABSTRACT AND INTERFACE?

    //ABSTRACT:
    //*Abstract class is declared with ABSTRACT KEYWORD
    //*It can have abstract and non-abstract methods
    //We use extend keyword
    //We cannot create an object from abstract class
    //We can only extend 1 parent

    //INTERFACE:
    //*Interface class is declared with INTERFACE KEYWORD
    //*We use IMPLEMENT keyword
    //*We cannot create an object from interface class
    //*It can have abstracts methods, DEFAULT methods,static methods
    //*WE CAN IMPLEMENT AS MANY AS PARENTS WE WANT.(extend can also come
    //before implement but only 1 extend key word.

     void name();

    default void name1(){
        System.out.println("Hi");
    }
     static void name2(){

    }
}

