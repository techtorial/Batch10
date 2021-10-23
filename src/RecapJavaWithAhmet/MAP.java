package RecapJavaWithAhmet;

import java.util.HashMap;

public class MAP {
    //POSSIBLE INTERVIEW QUESTIONS:
    //1) CAN YOU TELL ME ABOUT MAP AND WHY DO YOU USE MAP IN YOUR PROJECT?
    //2)WHAT IS THE CONNECTION BETWEEN MAP AND COLLECTION?
    //3) WHAT IS THE TYPE OF MAP AND DIFFERENCE BETWEEN THEM?
    //4*****)WHAT IS THE DIFFERENCE BETWEEN HASHMAP AND HASHTABLE?

    //MAP IS THE WAY OF STORING DATA AS A KEY AND VALUE FORMAT.
    // I LOVE USING MAP IN MY PROJECT BECAUSE IT HAS KEY AND VALUE FORMAT
    //WHICH IS GOOD FOR MY PROJECT TO STORE LIKE CUSTOMER NAME WITH BALANCE
    //2) MAP<KEY,VALUE> KEY ONLY STORES THE UNIQUE VALUE WHICH MEANS IT IS
    //ACTING LIKE SET
    //2*)VALUE MAY OR NOT STORE DUPLICATES AS A VALUE WHICH MEANS IT IS
    //ACTING LIKE LIST
    //3)HASHMAP --> randomly stores
    //3*)LINKHASHMAP--> insertion order
    //3**)TREEMAP-->ascending order

    //(***********))
    //THE MAIN DIFFERENCE is THREAD-SAFE(SYNCHRONIZED)
    //FIRST COME FIRST SERVE
    //IT MEANS THE SYSTEM WILL **WAIT** UNTIL THE ACTION IS DONE THEN
    //IT WILL CONTINUE FOR THE NEXT ACTIONS


    //sample output is  : Apple = 4,Banana = 3,Orange = 3,Peach = 1,Strawberry = 1

    public static void main(String[] args) {
        String[] brands = {"Apple", "Banana", "Orange", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Orange", "Banana", "Apple"};

        HashMap<String, Integer> counting = new HashMap<>();

        for (int i = 0; i < brands.length; i++) {
            if (!counting.containsKey(brands[i])) {
                counting.put(brands[i], 1);
            } else {
                counting.put(brands[i], counting.get(brands[i])+1);
            }
        }
        System.out.println(counting);



    }
}
