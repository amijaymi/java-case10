import java.lang.Math;
public class Car implements CommercialVehicle,PersonalVehicle {
    private int modelYear;
    private double engineVolume;
    public Car(int modelYear,double engineVolume){
        this.modelYear=modelYear;
        this.engineVolume=engineVolume;
    }
    public int getModelYear(){
        return this.modelYear;
    }
    public double getEngineVolume(){
        return this.engineVolume;
    }
    @Override
    public double calculateTax(double baseTax){
        double eq=baseTax*engineVolume;
        return eq;
    }
    public double calculateAmortizedTax(double baseTax, int currentYear){
        double tax;
        if(currentYear>=9){
            tax=0.9;
        }
        else{
            tax=baseTax*Math.pow(0.1,currentYear);
        }
        return tax;
    }
}
