package in.regno.exception.enums;

public class TestEnum {
    public static void main(String[] args) {
        TrafficLight c1 = TrafficLight.RED;
        TrafficLight c2 = TrafficLight.GREEN;
        TrafficLight c3 = TrafficLight.YELLO;
        Grade First = Grade.A;
        Grade Second = Grade.B;
        Grade Third = Grade.C;
        Grade Fourth = Grade.D;
        Grade Fifth = Grade.E;
        for(Grade value:Grade.values()){
            System.out.println(value);
        }

    }


}
