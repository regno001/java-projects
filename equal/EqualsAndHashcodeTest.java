package in.equal;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        person per1 = new person("Rahul",21,"001");
        person per2 = new person("Rahul",21,"001");
if (per1.equals(per2)){
    System.out.println("Equal");
}else{
    System.out.println("Not Equal");
}

    }
}

