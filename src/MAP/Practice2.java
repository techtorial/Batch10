package MAP;

import java.util.*;

public class Practice2 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();

        map.put(1, "des plaines");
        map.put(2, "lake forest");
        map.put(3, "chicago");
        map.put(4, "austin");
        map.put(5, "new york");

        // size()
        System.out.println(map.size());
        map.put(null, null);
        System.out.println(map);
        map.put(1, "schaumburg");
        System.out.println(map);

        map.replace(1, "XXXX");
        System.out.println(map);
        map.replace(1, "XXXX", "YYY");
        System.out.println(map);


        Boolean bl = map.containsKey(2); // true
        boolean bl1 = map.containsKey(3); // true
        boolean bl2 = map.containsValue("washington");
        System.out.println(bl2);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.getOrDefault(2, null));
        System.out.println(map.getOrDefault(6, " - "));


        // print out all values from this map one by one

        map.get(1);

        // to get all keys from map
        Set<Integer> zipCodes = map.keySet();
        // iterate over the set which contains all the keys(zipcodes)
        for (Integer zipCode : zipCodes) {

            System.out.println(map.get(zipCode)); // pass each key into get() method to get values
        }

        Collection<String> cities = map.values();

        System.out.println(cities);

        for (String city: map.values()){

            System.out.println(city);

        }

//        map.clear();
//        System.out.println(map);


    }

}
