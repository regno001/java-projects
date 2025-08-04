import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        greet();
        Table();

    }
    public static int Table(){
        Scanner input = new Scanner(System.in);


          int a = input.nextInt();
          int i=1;
          while(i<=10){
              System.out.println(a + " * " +i +" = " +a*i  );
          i++;

          }
        System.out.println("Execution has been Completed");
         return Table();
    }
    public static void greet(){
        System.out.println("Welocme to the TABles ");
        System.out.println("Enter the number that you want for tables");
    }

}
