package Primitives;

public class LogicalOperator {
    public static void main(String[] args) {

        int myAge = 15;
        boolean myDress = true;

        int ageReq = 21;
        boolean dressCode = true;

        boolean can_I_Attend = myAge >= ageReq && myDress == dressCode;

        System.out.println(can_I_Attend);
        myAge = 20;
        boolean can_I_Attend1 = myAge >= ageReq && myDress == dressCode;

        System.out.println(can_I_Attend1);

        boolean can_I_Attend2 = myAge <= ageReq && myDress == dressCode;

        System.out.println(can_I_Attend2);

        //==============================

        int myNewAge = 28;
        boolean myMoney = false;
        int ageRequirement = 18;
        boolean moneyReq = true;

        boolean canIGo = myNewAge >= ageRequirement || myMoney == moneyReq;

        System.out.println(canIGo);
        myNewAge = 8;

         canIGo = myNewAge >= ageRequirement || myMoney == moneyReq;
        System.out.println(canIGo);

        myMoney = true;
        canIGo = myNewAge >= ageRequirement || myMoney == moneyReq;
        System.out.println(canIGo);
    }
}
