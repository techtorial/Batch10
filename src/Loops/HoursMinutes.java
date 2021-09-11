package Loops;

public class HoursMinutes {

    public static void main(String[] args) {
        /*
        		create a digital clock that prints hours and minutes
		>> hours from 0 to 11 included
		>> minutes from 0 to 59 included
		0 : 0
		0 : 1
		0 : 2
		0 : 3
		.....
         */
        for (int a = 0; a < 2; a++) {

            for (int hour = 0; hour < 12; hour++) {

                for (int minutes = 0; minutes < 60; minutes++) {
                    if (a == 0){
                        System.out.println(hour + " : " + minutes + " am");
                    }
                    else {
                        System.out.println(hour + " : " + minutes + " pm");
                    }
                }
            }
        }
//        for (int hour=0; hour<12; hour++){
//
//            for (int minutes = 0; minutes<60; minutes++){
//
//                System.out.println(hour +" : "+ minutes + " pm");
//            }
//        }

    }
}
