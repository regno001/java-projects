public class car {
    int noOfWheels;
    int NoOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public car(String modelNumber, int noOfWheels, int noOfDoors, int maxSpeed, String name, String company) {
        this.modelNumber = modelNumber;
        this.noOfWheels = noOfWheels;
        NoOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "car{" +
                "noOfWheels=" + noOfWheels +
                ", NoOfDoors=" + NoOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        car Swift = new car("S84",4,4,120,"Swift", "Maruti" );
        System.out.println(Swift.toString());
    }
}
