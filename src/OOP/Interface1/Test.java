package OOP.Interface1;

public class Test {
    public static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.area(4));
        System.out.println(square.perimeter());
        // you can not create object from interface
       // Shape shape = new Shape();

        Shape shape = new Square();

        System.out.println(shape.area(6));

        System.out.println(shape.SIDE);
        System.out.println(Shape.SIDE);


        System.out.println(square.SIDE);
      //  square.SIDE = 4; you can not re-assign final variable

        Triangle triangle = new Triangle();

        triangle.height=7;
        System.out.println(triangle.height);
        System.out.println(triangle.area(8));

        shape.info();
        square.info();
        triangle.info();


        square.info("SQUARE");


    }
}
