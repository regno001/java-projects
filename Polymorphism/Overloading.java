package in.regno.Polymorphism;

public class Overloading {
    public int add(int a , int b){
        return a+b;
    }
     public int add(int a,int b ,int c, int d){
        return a+b+c+d;
     }
     public String add(String a, String b){
        return a+b;
     }
    public static void main(String[] args) {
        Overloading ov = new Overloading();
        System.out.println(ov.add(1,2));
        System.out.println(ov.add(1,2,4,5));
        System.out.println(ov.add("Rahul ","Rawat"));
    }
}
