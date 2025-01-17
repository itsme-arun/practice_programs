//find LCM and GCD of Two numbers
import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1 = in.nextInt();//user input for first number
        System.out.print("Enter Second Number:");
        int num2 = in.nextInt();//user input for second number
        int gcd = gcd(num1, num2);//calling the gcd function
        int lcm = (num1 * num2)/gcd;//formula for calculating lcm using gcd
        System.out.println("GCD:" + gcd);
        System.out.println("LCM:" + lcm);
    }
    // Method to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b){
        while(b!=0){ //when b becomes zero it will return the value that is stored in 'a' which is the gcd of the given numbers
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
