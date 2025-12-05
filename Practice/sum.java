import java.util.Scanner;

public class sum{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number ");
long a= input.nextLong();
long sum=0;
for(long i=1;i<=a;i++){
 sum +=i/facto(i);
}
System.out.println("Sum is "+ sum);

}
public static  long facto(long a){
long fact=1;
for(long i=1;i<=a;i++){
fact *= i;
}
return fact;
}
}