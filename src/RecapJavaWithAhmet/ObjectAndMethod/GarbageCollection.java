package RecapJavaWithAhmet.ObjectAndMethod;

public class GarbageCollection {
    //Possible Interview Question:
    //1)WHat is garbage collecter and where it is coming from ?
    //1*) How can you prove that gc is working
    //2))HOw can you make the object garbage.
    //3) CAN YOU CALL gc many times ? (OCA)

    // Garbage collector is the way of cleaning unused or useless
    //data in the class.It comes from SYSTEM.
    //System.gc()
    //YOu need to override the finalize method from the object to see
    //that gc is working.
    //2) you can make the object by assing NULL value
    // int a = 5; int b = 6 ; int c = 7; a =b
    //at this time 5 value will be garbage.
    //3)YOu can only call gc 1 time.
    //SYSTEM.GC ()0--> it is automatically doing it already.

}
