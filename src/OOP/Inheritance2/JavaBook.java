package OOP.Inheritance2;

public class JavaBook extends Book{

    public JavaBook(String title, double price, int pageNumber) {
        super(title, price, pageNumber);
    }

    public JavaBook() {
    }

@Override
public void info(){
    System.out.println("Hi, I am in the Java book class");
}



    public static int listen() {
        System.out.println("You are listening Java book");
        return pageNumber;
    }





    public static void main(String[] args) {
        Book book = new Book("Blue Book",19.99,500);
        JavaBook javaBook = new JavaBook();
        javaBook.pageNumber=700;
        System.out.println(javaBook.pageNumber);
        JavaBook javaBook1 = new JavaBook("Java Book", 49.99,400);
        System.out.println(javaBook1.pageNumber);
        JavaBook javaBook2 = new JavaBook();
        System.out.println(javaBook2.pageNumber);
        book.info();
        javaBook2.info();

        book.listen();
        javaBook2.listen();

        javaBook.listen("Java Audio");
        book.listen("Audio");
        Book.listen();
        listen();

    }

}
