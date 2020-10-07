package Lektion1;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 11:46
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class UsedFuel {
    private double miles;

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(double gasUsed) {
        this.gasUsed = gasUsed;
    }

    private double gasUsed;
    public UsedFuel(double miles, double gas){
     this.miles=miles;
     this.gasUsed=gas;
    }
    public double averageMile(){
        return gasUsed/miles;
    }

}
