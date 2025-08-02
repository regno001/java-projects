import java.util.Scanner;
public class Greades {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks");
        int a = input.nextInt();
        if (a>=90){
            System.out.println("Congrats Topper you got Grade A With" + a + "%");
        }
        else  if (a<90 && a>75){
            System.out.println("Congrats BAby you got Grade B With" + a +"%");
        } else  if (a<75 && a>60){
            System.out.println("Congrats ladle bhot hai itna , you got Grade C With" + a +"%");
        } else  if (a<60 && a>30){
            System.out.println("Bhai Kiya KR rha hai tu , you got Grade D With" + a +"%");
        }else{
            System.out.println("Doob ke MArja Fail hai tu" + a +"%" );
        }

    }
}
