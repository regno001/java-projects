package in.regno.exception.ThreadPrograms.t1;

public class Test {
    public static void main(String[] args) {
        T1 t1=new T1(1);
       T1 t2= new T1(2);
       t1.start();
       t2.start();
    }
}
