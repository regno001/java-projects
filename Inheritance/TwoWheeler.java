package in.Inheritance;

public class TwoWheeler extends Vehicle {
TwoWheeler()
{
    noOfTires=2;
}
public void balance(){
    System.out.printf("i am Balancing on %d tires\n",noOfTires);
}
}
