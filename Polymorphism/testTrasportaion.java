package in.regno.Polymorphism;

public class testTrasportaion {
    public static void main(String[] args) {
        car c = new car();
        vehicle v = new vehicle();
        vehicle vc = new car();
        vehicle vp = new plane();
        plane p = new plane();

        castTest(c);
        c.noOfdoors();

    }
    private static void castTest(vehicle vh){
        car c= (car) vh;
        ((car) vh).noOfdoors();
        c.start();
        c.noOfdoors();
    }
}
