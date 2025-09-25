package in.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle veh= new Vehicle();
        TwoWheeler to = new TwoWheeler();
        motorcycle mo=new motorcycle();
        veh.commmute();
        to.commmute();
        mo.commmute();
        mo.start();
        mo.balance();
        to.balance();
    }
}
