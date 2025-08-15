public class car {
    int noOfWHeels;
    String color;
    float maxSpeed;
    float FuelInLiter;
    int noOfSeat;
    public void drive() {
        if (FuelInLiter == 0) {
            System.out.println("Car Is Out of fuel");
        } else if (FuelInLiter < 5) {
            System.out.println("Car is in reserve mode ,plese Refuel");
            FuelInLiter--;
        } else {
            System.out.println("car is Driving");
            FuelInLiter--;
        }
    }
    public void addFuel(float fuel){
        FuelInLiter +=fuel;
    }
    public float getCurrentFuelLevel(){
        return FuelInLiter;
    }

}
