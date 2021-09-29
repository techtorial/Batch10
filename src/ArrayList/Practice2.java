package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        /*
        create an ArrayList to Store 5 colors
        store 5 different colors in that arraylist
        use traditional for loop to print out each element from the arraylist
         */
        ArrayList<String> colors = new ArrayList<>();

        colors.add("white");
        colors.add("black");
        colors.add("pink");
        colors.add("violet");
        colors.add("red");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {

            System.out.println(colors.get(i));
        }
        for (String color : colors) {

            System.out.println("this is from for each loop>> " + color);
        }
        // name you method as >> printFruits
        // crate a method that will take an arraylist as parameter
        // prints the elements if they have 5 or more letters
        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("kiwi");
        fruitNames.add("apple");
        fruitNames.add("banana");
        fruitNames.add("pineapple");
        fruitNames.add("plum");
        // printFruits(colors);
        Practice2 object = new Practice2();
        object.printFruits(fruitNames);
    }

    // remove the short fruit names from the arraylist
    public void printFruits(ArrayList<String> fruits) {
//
//        for (String fruit : fruits){
//
//            if (fruit.length()>=5){
//                System.out.println(fruit);
//            }else {
//
//                fruits.remove(fruit);
//
//            }
//
//        }

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).length() < 5) {
                fruits.remove(i);
            } else {
                System.out.println(fruits.get(i));
            }
        }
        System.out.println(fruits);
    }
}
