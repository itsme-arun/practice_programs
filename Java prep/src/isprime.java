//print prime numbers upto n numbers
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Print all prime numbers up to N
        System.out.println("Prime numbers up to " + n + ":");
        printPrimesUpToN(n);

        scanner.close();
    }
    //used to print prime up to n numbers
    public static void printPrimesUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    //it return true if the number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) { // Check divisors up to √num
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
