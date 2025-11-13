public class RectangleDemo {
    double width, height;
    RectangleDemo(double w, double h) { width = w; height = h; }
    double calculateArea() { return width * height; }
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        RectangleDemo rect = new RectangleDemo(5.5, 3.2);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
