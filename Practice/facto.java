public class facto{
public static void main(String[] args){
System.out.println("Enter the Number ");
int a=Integer.parseInt(args[0]);
int fact=1;
for(int i=1;i<=a;i++){
fact =fact*i;
}
System.out.println("Factorial Of" + a + "=" + fact);

}

}