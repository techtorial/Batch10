import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void findInputs(String[] logs) {
        Map<String, String> map = new HashMap();

        for (int i = 0; i < logs.length; i++) {
            // logs[i]  "A:2"
            String[] idInput = logs[i].split(":");
            // idInput[0]="A" idInput[1]="2"
            // First element from this string is input second string from
            // this array is id
            if (!map.containsKey(idInput[1])) {
                map.put(idInput[1], idInput[0]);

            } else { String previousInput = map.get(idInput);
                map.put(idInput[1], previousInput + idInput[0]);


            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String[] logs= new String[]{
                "A:1",
                "C:2",
                "B:3",
                "A:3",
                "C:1",
                "A:2",
                "A:1",
                "B:2",
                "B:3",
                "C:2",
        };
        findInputs(logs);
    }
}
