import java.util.Scanner;

public class linear{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enetr the Size of an Array");
int a= input.nextInt();
int[] arr= new int[a];
for(int i=0;i<arr.length;i++){
arr[i]=input.nextInt();
}
int pos=-1;
System.out.println("Enter the Element to be found");
int key=input.nextInt();
for(int i=0;i<arr.length;i++){
if(arr[i]==key){
pos=i;
}
}
if(pos==-1){
System.out.println("Element not found");
}else{
System.out.println("Element found "+ key +"at index "+ pos);
}


}
}