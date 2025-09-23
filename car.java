package in.rahul;

public class car {
    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", Fuellevel=" + Fuellevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

    public car(String color, String model, long costOfPurchase, double fuellevel) {
        this.color = color;
        this.model = model;
        this.costOfPurchase = costOfPurchase;
        Fuellevel = fuellevel;
    }

    public String color;
    public String model;
    private double Fuellevel;
     long costOfPurchase;

}
