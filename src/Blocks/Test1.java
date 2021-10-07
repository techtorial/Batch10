package Blocks;

public class Test1 {

    public static void main(String[] args) {

        Practice obj1 = new Practice();
        Practice obj2 = new Practice();
        Practice obj3 = new Practice();
        Practice obj4 = new Practice();
        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);
        obj1.number = 44;
        System.out.println("===============");
        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);
        System.out.println("===============");
        obj1.id = 55;
        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);

    }
}
