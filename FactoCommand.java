public class FactoCommand {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please provide a command-Line argument");
        return;
        }
        int n=Integer.parseInt(args[0]);
        long fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Name:Rahul");
        System.out.println("Rollno:47");
        System.out.println("Course:BCA,G1");
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
