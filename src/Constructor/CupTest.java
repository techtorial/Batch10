package Constructor;

public class CupTest {

    public static void main(String[] args) {

        Cup c1 = new Cup(12, true, 8);

        System.out.println(c1.isClean);
        System.out.println(c1.liquidAmount);

        Cup c2 = new Cup();
        System.out.println(c2.liquidAmount);

        System.out.println(c1);
        System.out.println(c2);
        c1.info();
        c2.info();

        Cup c3 = new Cup(16, true, 12);

        System.out.println(c3);
        Cup c4 = c1;

        c1 = null;

        c4 = c1;


        System.out.println(c1);
        System.out.println(c4);

        Cup c5 = new Cup(22, false);
        Cup c6 = new Cup(16, true, 12);
        c5 = null;
        c6=null;
        System.gc();


    }
}
