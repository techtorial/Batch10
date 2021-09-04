package Switch;

public class Practice2 {
    public static void main(String[] args) {
        String name = "Zack".toUpperCase();

        switch (name) {
            default:
                System.out.println("Student is not here");
                break;

            case "ALEX":
                System.out.println("Alex is here");
                break;
            case "DAVID":
                System.out.println("David is here");
                break;
            case "LUNA":
                System.out.println("Luna is here");
                break;
        }

    }
}
