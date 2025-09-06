import java.util.Scanner;

public class palindromRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palendrome checker ");
        System.out.println("Enter the String ");
        String a= input.next();
        System.out.println("Your string is  "+ ((palendrome(a)? "Palendrome" : "Not PAlindrome")) );
    }
    public static boolean palendrome(String a){
         if(a.length()<=1){
              return true;
         }
         int lastpos=a.length()-1;
         if (a.charAt(0)!=a.charAt(lastpos)){
             return false;
         }
         String newStr = a.substring(1,lastpos);
         return palendrome(newStr);
    }
}
