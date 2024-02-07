public class test {
    public static void main(String[] args) {
        Car car=new Car(2000, 5600);
        Bus bus=new Bus(1996,50000);
        System.out.println(car.calculateAmortizedTax(2000, 2023));
        System.out.println(car.calculateTax(2000));
        System.out.println(bus.calculateAmortizedTax(5000, 2023));
    }
}
