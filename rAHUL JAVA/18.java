public class OddEvenThreads {
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2)
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
        }, "OddThread");
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2)
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
        }, "EvenThread");
        odd.start();
        even.start();
    }
}
