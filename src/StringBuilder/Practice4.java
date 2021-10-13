package StringBuilder;

public class Practice4 {

    // create a method that will take a StringBuilder as a parameter
    // this method will calculate the and return sum of the digits from given string-builder object

    // "urjsd123idfvne5y24fgiero%8lk"  >>> 1+2+3+5+2+4+8 = 25


    public int sumOfDigits(StringBuilder builder) {
        int sum = 0;

        for (int i = 0; i < builder.length(); i++) {

            char ch = builder.charAt(i);

            if (Character.isDigit(ch)) {
                int number = Integer.parseInt(String.valueOf(ch));
                sum = sum + number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Practice4 object = new Practice4();
        StringBuilder stringBuilder = new StringBuilder("urjsd123idfvnfgiero%lk");

        System.out.println(object.sumOfDigits(stringBuilder));
    }


}
