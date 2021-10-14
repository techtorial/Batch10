import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void solution(String str){

        // First we need to find count of every vowel
        // Then from those counts we need to find maximum count
        // Last step we should print all the vowels which have maximum count
        String vowels= "aeiou";
        Map<String,Integer> countMap= new TreeMap();
        for(int i=0; i<str.length();i++){
            String currentLetter = str.charAt(i)+"";
            if(vowels.contains(currentLetter)){
                // It means this letter is vowel
                if(!countMap.containsKey(currentLetter)){
                    countMap.put(currentLetter,1);
                }else{
                    // First we need to find count of this vowel from map and
                    // increase by one
                    int count = countMap.get(currentLetter)+1;
                    countMap.put(currentLetter, count);
                }

            }

        } //  i will have map vowels and count of every vowel
        // ["a:3","e:2"]
        // How can we find maximum count from map?
        // We can find in one line
        // Return type of values method is collection
        int maximumCount=  Collections.max(countMap.values());

        // Last step we should print all the vowels which have maximum count
        Set<String> keys = countMap.keySet();
        for(String key: keys){
            if(maximumCount==1){
                // If the key has maximum value
                if(countMap.get(key)==maximumCount){
                    System.out.println(key+" appears"+maximumCount+" time");}
            }

        else{
            if(countMap.get(key)==maximumCount){
                System.out.println(key+" appears"+maximumCount+" times");}
        }

    }


}

    public static void main(String[] args) {
        String str="iou";
        solution(str);
    }
      }

