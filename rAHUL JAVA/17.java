interface PaymentMethod {
    void processPayment(double amount);
    void refundPayment(double amount);
}
class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
    public void refundPayment(double amount) {
        System.out.println("Refunding Credit Card payment of $" + amount);
    }
}
class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}
public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        PaymentMethod cc = new CreditCard();
        PaymentMethod pp = new PayPal();
        cc.processPayment(200);
        cc.refundPayment(50);
        pp.processPayment(200);
        pp.refundPayment(50);
    }
}
