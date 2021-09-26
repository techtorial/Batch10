package Constructor;

import Methods.Calculator;

public class Cup {

    int size;
    boolean isClean;
    double liquidAmount;

    public Cup(int inputSize, boolean inputClean, double inputLiquidAmount) {
        this();
        this.size = inputSize;
        this.isClean = inputClean;
        this.liquidAmount = inputLiquidAmount;

    }

    public Cup(int newSize, boolean newClean) {
        this.size = newSize;
        this.isClean = newClean;
        System.out.println("This is two argument constructor");
    }

    public Cup() {
        this(33, true);
        System.out.println("This is NO argument constructor");
    }

    //=============================================
    public void info() {

        System.out.println("Size: " + size + " isClaen: " + isClean
                + " Liquid amount is: " + liquidAmount);
    }

    @Override
    public String toString() {
        return "Size: " + size + " isClaen: " + isClean
                + " Liquid amount is: " + liquidAmount;
    }

    @Override
    protected void finalize() {

        System.out.println("Now one object went to the garbage");

    }

}
