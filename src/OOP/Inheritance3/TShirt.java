package OOP.Inheritance3;

 public final class TShirt extends  Shirt{
    String color;
    public TShirt(){
        super("M", 25);
    }

 //   @Override  >> you can not override a final method
//    public String info() {
//        return "This is info about T-Shirt";
//    }
}
