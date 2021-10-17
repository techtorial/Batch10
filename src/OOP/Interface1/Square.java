package OOP.Interface1;

public class Square implements Shape{

    @Override
   public Integer area(int side){
       return side*side;
    }

    public Double perimeter(){

        return 10.5;
    }

}
