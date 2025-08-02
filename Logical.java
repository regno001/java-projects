import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String A = input.nextLine();
        System.out.println("Enter the male(true/false)");
      boolean G= input.nextBoolean();
        System.out.println("Enter the Age");
      int a = input.nextInt();
      if ( a>70 && G==true){
          System.out.println("Ticket PRice=" + (100-70));
      } else if (a<70 && G==true) {
          System.out.println("Ticket price ="+(100-40));
          
      } else if (a<10 && !G) {
            System.out.println("Ticket Price ="+(100));


      }
    }
}
