import java.util.Scanner;
public class reverse{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
String a = input.next();
String[] arr=a.split("");

for(int i=arr.length-1;i>=0;i--){
System.out.print(arr[i]);
}

}
}