package MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        HashMap <String, String> map = new HashMap();
        HashMap <String, Double> map1 = new HashMap();
        HashMap <String, HashSet<Integer>> map3 = new HashMap();

        HashMap <HashMap<String, Integer>, String> map4 = new HashMap();

        map.put("11","David");
        map.put("22","Alex");
        map.put("33","Sorin");

        System.out.println(map);
        map.put("33","Zack");
        System.out.println(map);

        map.put("44","Alex");
        System.out.println(map);

        map.put(null,"Jenny");
        System.out.println(map);
        map.put(null,"Arzu");
        System.out.println(map);

        map.put("55",null);
        map.put("66",null);
        map.put("77",null);
        System.out.println(map);

        // get()
        System.out.println(map.get("22"));
        String nullValue = map.get(null);
        System.out.println(nullValue.concat("***"));

        map.get(null).concat("!!!");


        map.get("11");
        map.get("22");
        map.get("33");

       Set<String> keys =  map.keySet();

        System.out.println(keys); // [11, 22, 33, 44, null, 55, 66, 77]

//        for (int i=0; i<keys.size();i++){
//            System.out.println(i);
//            System.out.println(  map.get(i)  );
//
//        }

        System.out.println("==================");
            for (String key: keys){

                System.out.println(map.get(key));
            }
    }
}
