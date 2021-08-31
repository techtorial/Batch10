package String;

public class MethodChaining {
    public static void main(String[] args) {
                /*
    - Replace all letter 'a's with single '*' and letter 'e's with double '**',
    - change all string value to UPPERCASE
    - Find index of First '*'
    - Multiply that value by 10 and
    - Print out the result
         */
        String text = "  just do it   ";
        int x = text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');

        System.out.println(x);// number

        char ch = text.replace('a','*').trim().replace("e","**").toUpperCase().charAt(0);

        String a = text.replace('a','*').trim().replace("e","**").toUpperCase();
        System.out.println(ch);// char
        System.out.println(a); // string
    }
}
