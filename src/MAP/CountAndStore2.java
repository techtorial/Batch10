package MAP;

import java.util.HashMap;

public class CountAndStore2 {

    public static void main(String[] args) {

        String string = "It is easy with practice";
        // I -- 1
        // t -- 3
        // i -- 3
        // s -- 2
        // .....

        HashMap <Character, Integer> letterCount = new HashMap<>();

        for (int index=0; index<string.length(); index++){

            if (string.charAt(index)==' '){
                continue;
            }
            if (!letterCount.containsKey(string.charAt(index))){

                letterCount.put(string.charAt(index),1);

            }
            else{
                letterCount.put(string.charAt(index), letterCount.get(string.charAt(index))+1);
            }
        }
        System.out.println(letterCount);



    }
}
