package firm;

/**
 * @author Cintia
 * @since 08/04/2022
 */

public class Commission extends Hourly{
    protected double totalSales;
    protected double commissionRate;
    
    //constructor
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    //methods
    public void addSales (double totalSales){
        this.totalSales = totalSales;
    }
    
    public double pay (){
        return super.pay() + commissionRate;
    }
    
    public String toString(){
        return super.toString() + "\nTotal sales : " + totalSales;
    }
}
