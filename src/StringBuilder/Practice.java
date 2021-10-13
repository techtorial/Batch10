package StringBuilder;

import Array.Cat;
import Constructor.Car;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        String test = "Test";

        test = test.concat(" is coming with Selenium Web Driver");

        test = test.substring(test.indexOf('S'));

        test = test.concat(" is testing tool");

        System.out.println(test);
        //=================================
      //  StringBuilder build  = "TEST"; will not compile
        StringBuilder builder = new StringBuilder("Test");

        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append("Test1");

        builder.append(" is coming with Selenium Web Driver");

        System.out.println(builder);

        builder.append(true);
        builder.append(123);
        builder = builder.append("8888888888888888");
        System.out.println(builder);


        // charAt()
        System.out.println(builder.charAt(0));

        // indexOf()
        System.out.println(builder.indexOf("w"));
        System.out.println(builder.indexOf("J"));
        System.out.println("first 8 >> "+builder.indexOf("8"));
        System.out.println(builder.length());
        System.out.println(builder.charAt((builder.length()-1)));
      //  System.out.println(builder.indexOf((builder.length()-1)));

        //Test is coming with Selenium Web Drivertrue1238888888888888888 is cool

        System.out.println("last 8 >> "+builder.lastIndexOf("8"));

        // length
        // append
        // indexOf
        // lastIndexOf
        //charAt
        // replace

        builder.replace(46,61, "*");
        System.out.println(builder);
        builder.replace(builder.indexOf("*"),(builder.indexOf("*")+1),"$$$$$$");
        System.out.println(builder);


        // substring()


       String sub = builder.substring(builder.indexOf("$"));
        System.out.println(sub);
        System.out.println(builder);

        builder.append(sub);
        System.out.println(builder);

        // reverse()

        StringBuilder builder2 = new StringBuilder("Interview");

        builder2.reverse();
        System.out.println(builder2);
        builder2.reverse();
        // insert

        builder2.insert(1,"$$$");
        System.out.println(builder2);


        int[] nums = {1,2,3};
        builder2.insert(builder2.indexOf("t"), Arrays.toString(nums));
        System.out.println(builder2);

        Cat cat = new Cat();
        builder2.insert(0, cat);
        System.out.println(builder2);

        // delete
        builder2.delete(0,3);
        System.out.println(builder2);
        System.out.println(builder2.length());
        builder2.delete(34,49);
        System.out.println(builder2);
        // deleteCharAt
        System.out.println(builder2.deleteCharAt(33));
        builder1.insert(0, new Car());
        System.out.println(builder1);




    }
}
