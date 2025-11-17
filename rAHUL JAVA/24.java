import java.io.*;
public class PrimeFile {
    // Method to check prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Name: SAWAN");
        System.out.println("Roll No: 56");
        System.out.println("Course: BCA G1");
        try {
            // Write 1–999 to number.txt
            BufferedWriter numOut = new BufferedWriter(new FileWriter("number.txt"));
            for (int i = 1; i <= 999; i++) {
                numOut.write(i + "\n");
            }
            numOut.close();
            // Read number.txt and write primes to prime.txt
            BufferedReader br = new BufferedReader(new FileReader("number.txt"));
            BufferedWriter primeOut = new BufferedWriter(new FileWriter("prime.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line);
                if (isPrime(n)) primeOut.write(n + "\n");
            }
            br.close();
            primeOut.close();
            // Read prime.txt and print primes
            System.out.println("Prime Numbers:");
            BufferedReader pr = new BufferedReader(new FileReader("prime.txt"));
            while ((line = pr.readLine()) != null) {
                System.out.print(line + " ");
            }
            pr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}