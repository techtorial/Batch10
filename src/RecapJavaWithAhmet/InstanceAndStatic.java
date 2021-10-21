package RecapJavaWithAhmet;

public class InstanceAndStatic {
    //POSSIBLE INTERVIEW QUESTION:
    //1)WHAT IS THE DIFFERENCE BETWEEN INSTANCE AND STATIC BLOCK

    // The main difference between them is all about calling static
    //which belongs to class 1 time and all the way top.
    //Instance block belongs object and it will go after static
    //as many as objects you created.
    {
        System.out.println("I am an instance block");
    }
    static{
        System.out.println("I am a static Block");
    }
    static{
        System.out.println("I am a second static Block");
    }

    public static void main(String[] args) {
    InstanceAndStatic obje = new InstanceAndStatic();
        InstanceAndStatic obje3= new InstanceAndStatic();

        InstanceAndStatic obje1 = new InstanceAndStatic();
        InstanceAndStatic obje2= new InstanceAndStatic();





    }

}
