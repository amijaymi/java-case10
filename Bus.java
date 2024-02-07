public class Bus implements CommercialVehicle  {
    private int modelYear;
    private double tonnage;
    public Bus(int modelYear,double tonnage){
        this.tonnage=tonnage;
        this.modelYear=modelYear;
    }
    public double calculateAmortizedTax(double baseTax,int currentYear){
        double tonnageRate;
        double ageRate=(currentYear-this.modelYear)*0.05;
        if(this.tonnage<1){
            tonnageRate=1;
        }
        else if(1<= this.tonnage && this.tonnage<=10){
            tonnageRate=1.4;
        }
        else{
            tonnageRate=1.6;
        }
        if(ageRate>=2){
            ageRate=2;
        }
        return baseTax*tonnageRate*ageRate;


    }
}
