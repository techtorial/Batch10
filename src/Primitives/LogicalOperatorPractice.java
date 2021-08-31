package Primitives;

public class LogicalOperatorPractice {

    public static void main(String[] args) {
        /*
        you need to pass a course
        - if you attend 95 percent or more of the classes
        or
        - you get more than 70 as passing score out of 100
         */
        int attendReq = 95;
        int scoreReq = 70;

        int myAttend = 95;
        int myScore = 60;

        boolean pass = myAttend >= attendReq || myScore > scoreReq;


        System.out.println("Am I passing "+!pass);
        System.out.println(!pass);
        System.out.println("Am I passing " + (myAttend >= attendReq || myScore > scoreReq));
    }
}
