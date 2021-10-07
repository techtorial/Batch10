package WrapperClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    //  I want you to write a method takes map<String,String> as parameter

    // removes all the items that has a empty string value ""
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("T","R");
        map.put("F","");
        System.out.println(removeEmptyValues(map));
    }
    public static Map<String,String> removeEmptyValues(Map<String,String> map){

        // We should see every value in this map
        // We need to check which ones are empty then delete it.
        Set<String> keys = map.keySet();
        for (String key:keys
             ) {
            String value= map.get(key);
            if (value.equals("")){
                map.remove(key);
            }
        }
return map;

    }




}
