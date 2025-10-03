package in.regno.interfacing;

public abstract class bird implements flyble{
    private final String breed;
    public bird(String breed){
        this.breed=breed;
    }
    @Override
    public void fly() {
        System.out.println("bird Flying high");
    }
}
