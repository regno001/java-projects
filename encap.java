import java.util.Scanner;

class std{
    private String name;
    private int age;
    public void setAge(int a){
        if(a>0){
            age =a;
        }else {
            System.out.println("Invalid Age ");
        }

    }
    public int getAge(){
        return age;
    }
}
public class encap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =   input.nextInt();
        std s = new std();
        s.setAge(a);
        System.out.println(s.getAge());
    }
}

