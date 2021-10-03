package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {

    public static void main(String[] args) {

        HashMap<String, Integer> dataMap = new HashMap<>();

        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);


        // get individual values,
        // get all values
        // get single element

        // entrySet
        System.out.println(dataMap);
        System.out.println(dataMap.entrySet());

        Set <Map.Entry<String, Integer>>   data =     dataMap.entrySet();
        System.out.println(data);

        // task: print out elements from this set one at a time

        for (  Map.Entry<String, Integer>   keyAndValue   :  data ){
            System.out.println(keyAndValue);
        }




        // create a method which takes a parameter of map, and this method will print out each extension one by one

      //  printValues(dataMap);
    }

    public static  void printValues(HashMap<String, Integer> map1){

        for (Integer ext: map1.values()){

            System.out.println(ext);
        }
    }
}
