public class prime{
public static void main(String[] args){
System.out.println("Enter the Number");
int a=Integer.parseInt(args[0]);
if(a%2!=0){
System.out.printf("%s is Prime",a);
}else{
System.out.printf("%s is not Prime",a);
}
}
}