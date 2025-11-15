abstract class Vehicle {
    String brand, model;
    double efficiency;
    Vehicle(String b, String m) { brand = b; model = m; }
    abstract double calcFuelEfficiency(double d, double f);
    void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Efficiency: " + efficiency);
    }
}
class Car extends Vehicle {
    Car(String b, String m) { super(b, m); }
    double calcFuelEfficiency(double d, double f) { return efficiency = d / f; }
}
class Bike extends Vehicle {
    Bike(String b, String m) { super(b, m); }
    double calcFuelEfficiency(double d, double f) { return efficiency = d / f; }
}
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        double carDist = 300, carFuel = 25;   // example values
        double bikeDist = 200, bikeFuel = 5;  // example values
        Car c = new Car("Honda", "City");
        c.calcFuelEfficiency(carDist, carFuel);
        c.showDetails();
        Bike b = new Bike("Yamaha", "R15");
        b.calcFuelEfficiency(bikeDist, bikeFuel);
        b.showDetails();
    }
}
