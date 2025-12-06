import java.util.Scanner;

public class array{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the row of an Array");
int a= input.nextInt();
System.out.println("Enter the Column of an Array");
int b=input.nextInt();
int[][] arr= new int[a][b];
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
arr[i][j]=input.nextInt();
}
}

for(int i=0;i<a;i++){
int sum=0;
for(int j=0;j<b;j++){
sum+=arr[i][j];
}
System.out.print("Sum of row "+ i + "="+sum);
}


}}