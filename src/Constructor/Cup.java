package Constructor;

import Methods.Calculator;

public class Cup {

    int size;
    boolean isClean;
    double liquidAmount;

    public Cup(int inputSize, boolean inputClean, double inputLiquidAmount){
        this.size=inputSize;
        this.isClean =inputClean;
        this.liquidAmount=inputLiquidAmount;
    }
    public Cup (){

    }

    public void info(){

        System.out.println("Size: "+size+" isClaen: "+isClean
        +" Liquid amount is: "+liquidAmount);
    }

    public String toString(){
        return "Size: "+size+" isClaen: "+isClean
                +" Liquid amount is: "+liquidAmount;
    }


}
