package MAP;

import java.util.HashMap;

public class CountAndStoreTask {

    // nike  -- 2
    // adidas - 1
    // reebok - 1
    // puma --- 3
    // ...
    public static void main(String[] args) {

        String[] brands = {"Nike","Adidas","Reebok","Puma","Armani","Armani","Armani","Armani","Clarks","Nike","Puma","Puma"};

        HashMap <String, Integer> brandCounts = new HashMap<>();

        for(int i=0; i< brands.length;i++){

          if (!brandCounts.containsKey(brands[i])){
              brandCounts.put(brands[i],1);
          }else {

             // int count = brandCounts.get(brands[i]);
              brandCounts.put(brands[i], brandCounts.get(brands[i])+1 );
          }

        }

        System.out.println(brandCounts);





    }


}
