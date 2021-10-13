package OOP.Inheritance2;

public class Book {

    String title;
    double price;
    static int pageNumber=404;

    public Book(String title, double price, int pageNumber) {
        this.title = title;
        this.price = price;
        this.pageNumber = pageNumber;
    }

    public Book() {
    }

    public void info() {

        System.out.println(title + "---" + price + "----" + pageNumber);
    }

    public static int listen() {
        System.out.println("you are listening the book");
        return --pageNumber;
    }
    public static int listen(String name) {
        System.out.println("you are listening the book"+name);
        return --pageNumber;
    }

}
