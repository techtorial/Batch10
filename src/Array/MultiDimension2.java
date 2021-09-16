package Array;

import java.util.Arrays;

public class MultiDimension2 {

    public static void main(String[] args) {


        String[][] states = new String[3][2];

        states[0][0] = "NY";
        states[0][1] = "PA";
        states[1][0] = "IL";
        states[1][1] = "OH";
        states[2][0] = "CA";
        states[2][1] = "WA";

        System.out.println(Arrays.deepToString(states));

        // please create a for loop to print these states in 2 mins
        String[] stateEmails = new String[6];
        int c = 0;
        for (int a = 0; a < states.length; a++) {

            for (int b = 0; b < states[a].length; b++) {

                stateEmails[c] =states[a][b].toLowerCase() + "@info.com";
                        System.out.println(states[a][b]);
                        c++;
            }
        }
        System.out.println(Arrays.toString(stateEmails));
        // please create FOR EACH loop to print these states in 2 mins

        System.out.println("---------------------");

        for (String[] state : states) {

            for (String st : state) {

                System.out.println(st.toLowerCase() + "@info.com");

            }
        }
        // print those states in lowe case

        // ny@info.com , pa@info.com ... and STORE these email addresses in an array

    }
}
