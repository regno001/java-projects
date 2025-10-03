package in.regno.interfacing;

public class eagle extends bird implements flyble{
    public eagle(String breed) {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Egale is flying ");
    }
}
