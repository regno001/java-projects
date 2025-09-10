import java.util.Scanner;
public class GeneratePin{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string with multiple words: ");
String input = sc.nextLine();
String[] words = input.split(" ");
int sum = 0;
for (String w : words) {
sum += w.length();
}
while (sum >= 10) { // keep reducing until single digit
int temp = 0;
while (sum > 0) {
temp += sum % 10;
sum /= 10; }
sum = temp; }
System.out.println("Generated PIN = " + sum);
         System.out.println("Name: Rahul");
        System.out.println("Rollno: 47");
        System.out.println("Course: BCA, G1");

}
 }