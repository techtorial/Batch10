package MAP;

import java.util.HashMap;

public class Practice1 {

    public static void main(String[] args) {

        HashMap <String, String> map = new HashMap();

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

    }
}
