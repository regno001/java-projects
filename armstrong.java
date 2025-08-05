import java.util.Scanner;

 class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to armstrong number");
        System.out.println("Please enter your number");
int num = input.nextInt();
boolean isArmstrong = isArmstrong(num);
if(isArmstrong){
    System.out.println("Your Number Is armstrong");
}else{
    System.out.println("Your number Is not a Armstrong");
}
    }
    public static boolean isArmstrong(int num){
        int digit=noOfDigit(num);
        int numcopy = num;
        System.out.println("no of digit" + digit);
        int finalNumber = 0;
        while (num>0){
            int digits = num%10;
            num /=10;
 finalNumber +=power(digits ,digit);
        }
        System.out.println("Final number is" + finalNumber);
        return finalNumber==num;
    }
public static int noOfDigit(int num){
        int digit = 0;
    while (num > 0) {
        digit++;
        num /=10;

    }
        return digit;
}
public static int power(int num1 , int num2){
        int result = num1;
        int i = 0;
        while(i<num2){
            result *=num1;
            i++;

        }
    System.out.println("power"+ num1 + result);
return result;
    }
 }
