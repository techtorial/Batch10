package StringBuilder;

public class Practice2 {

    public static void main(String[] args) {

        /*
        create a method that will take String as a parameter
        this method will delete '-' (dashes) from given string
        use delete/deleteCharAt() method to solve (StringBuilder object)
        print final version of string/stringbuilder object with no dashes
        "I-n-t-e-r-v-i-e-w" >> Interview

         */
        String str = "I--n-t--e---r-v-i-e-w-";
        dash(str);
    }

    public static void dash(String string){

        StringBuilder builder = new StringBuilder(string);


        for (int index =0; index < builder.length(); index++){

            if (builder.charAt(index) == '-'){

                builder.deleteCharAt(index);
                index--;

            }
        }
        System.out.println(builder);


    }

}
