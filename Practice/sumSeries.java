import java.util.Scanner;
public class sumSeries{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int sum=0;
for(int i=1;i<=a;i++){
int inSum=0;
for(int j=1;j<=i;j++){
inSum += j;
}
sum+=inSum;
}
System.out.println("sum"+ sum);
}
}