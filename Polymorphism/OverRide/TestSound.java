package in.regno.Polymorphism.OverRide;

public class TestSound {
    public static void main(String[] args) {
        ANimal a = new ANimal();
        ANimal b = new cow();
        ANimal c = new dog();
        ANimal d = new cat();
        ANimal e= new fish();
        a.sound();
        b.sound();
        c.sound();
        d.sound();
        e.sound();
    }
}
