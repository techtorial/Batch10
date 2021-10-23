package RecapJavaWithAhmet;

import java.util.HashSet;
import java.util.Set;

public class StringBuilder {
    //POSSIBLE INTERVIEW QUESTION:


    //1) WHAT IS THE DIFFERENCE BETWEEN STRING BUILDER AND STRINGBUFFER
    //2)WHAT IS THE DIFFERENCE BETWEEN STRING AND STRING BUILDER?


    //1) They are similar but the main different is synchrinazition which means in my
    //mind is first come first serve. Before it moves on the next action, it completes
    //the first one. (one by one) --> **WAIT TIME**** --> STRING BUFFER AND HASHTABLE
    //ARE BOTH SYNCHRONIZED
    //*String buffer execution is slower than String builder because of this wait time.

    //2) STRING AND STRING BUILDER :
    //* STRING IS IMMUTABLE
    //*STRING BUILDER IS MUTABLE
    //*STRING AND STRING BUILDER HAVE SOME DIFFERENT METHODS(APPEND, REVERSE..)

    public static void main(String[] args) {
        String name= new String("ahmet");
        String name1= "mehmet";
        Set<String> list = new HashSet<>();
    }

}
