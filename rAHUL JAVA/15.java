public class MethodOverloadingDemo {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        System.out.println("Sum (int, int): " + obj.add(5, 10));
        System.out.println("Sum (int, int, int): " + obj.add(2, 3, 4));
        System.out.println("Sum (double, double): " + obj.add(2.5, 3.7));
    }
}
