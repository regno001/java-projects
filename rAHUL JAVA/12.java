public class VowelConsonantCount {
    public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        String s = "Hello Java"; int v = 0, c = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray())
            if (ch >= 'a' && ch <= 'z')
                if ("aeiou".indexOf(ch) >= 0) v++; else c++;
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
