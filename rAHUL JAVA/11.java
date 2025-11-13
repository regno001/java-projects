public class ReverseStringNoBuiltIn {
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");

        String s = "Hello World", rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        System.out.println("Reversed: " + rev);
    }
}
