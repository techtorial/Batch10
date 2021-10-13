package OOP.Inheritance3;

public class Mall {

    public static void main(String[] args) {

        Shirt shirt = new Shirt("L",26);
        System.out.println(shirt.price);
        //shirt.COLOR="Red"; you can not re-assign value for final variable

        TShirt tShirt = new TShirt();
      //  tShirt.COLOR = "Black"; you can not re-assign value for final variable

        tShirt.color = "orange";
        System.out.println(tShirt.COLOR);
        TShirt tShirt1 = new TShirt();
        System.out.println(tShirt1.COLOR);
        System.out.println(tShirt.color);


    }
}
