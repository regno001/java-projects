import java.util.Scanner;
public class sumSeries{
public static void main(String[] args){
System.out.println("Enter the number ");
Scanner input= new Scanner(System.in);
int a=input.nextInt();
String s =Integer.toString(a);
int sum=0;
for(int i=0;i<s.length();i++){
int insum=0;
for(int j=i;j<s.length();j++){
insum+=s.charAt(j) - '0';
}
sum+=insum;
}
System.out.println("sum"+sum);

}
}