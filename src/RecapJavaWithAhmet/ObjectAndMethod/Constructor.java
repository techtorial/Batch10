package RecapJavaWithAhmet.ObjectAndMethod;

public class Constructor {
    //Possible Interview Question:
    //1)What is constructor and what do you do with it?
    //2)Can you tell me the difference between constructor and method?
    //3) can you make the constructor private?
    //4)What is the difference between this, this(), super, super()?

    /*
    explanation suggestion: GO FROM GENERAL TO DEEP

    CONSTRUCTOR is a way of initiliazing instance variables. We have specific
    features for the constructor like:
    *)it must have same name of the class
    *)it doesnt have return type
    ---> AGAIN WE NEED IT TO INITILIAZE our instance variable

    CONSTRUCTOR AND METHOD:
    DIFFERENCES:
    Method has return type
   Methods may or may not have same(class) or different reference name

   3)PRIVATE --> YOU CAN MAKE IT for the singleton pattern design(it is a special
   class that do not let you create an object.

   this--> is a keyword to call the variables or methods which belong to the SAME class
   this()-->is a method to call the constructor which belongs to the same class.
            *this() must be at the first line of the chaining constructor.
   super --> is a keyword to call the variables and methods which belong to the PARENT class.
   super()-->is a method to call the constructor which belongs to the parent class.
            *super() must be at the first line of the chaining constructor of parent.





     */
}
