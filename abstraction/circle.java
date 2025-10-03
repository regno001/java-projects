package in.regno.abstraction;

public class circle extends Shape{
    private int r =10;
    @Override
    public void calculateArea() {
        System.out.println(3.14*r*r);
    }
}
