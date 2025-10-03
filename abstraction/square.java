package in.regno.abstraction;

public class square extends Shape{
    private int s=10;

    @Override
    public void calculateArea() {
        System.out.println(s*s);
    }
}
