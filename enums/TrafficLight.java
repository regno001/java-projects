package in.regno.exception.enums;

public enum TrafficLight {
    RED("Stop"),GREEN("Go"),YELLO("Wait");
    private final String action;

    TrafficLight(String action){
        this.action=action;
    }
}
