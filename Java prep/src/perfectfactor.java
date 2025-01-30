//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding
//the number itself. A divisor of an integer x is an integer that can divide x evenly.
//Given an integer n, return true if n is a perfect number, otherwise return false.
//Example 1:
//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, and 14 are all divisors of 28.
//Example 2:
//Input: num = 7
//Output: false
import java.util.*;
public class perfectfactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(perfectfact(num));
    }
    public static boolean perfectfact(int n){
        boolean result = false; //initializing boolean value as false
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){ //checking  factors upto n
                sum += i; //if the above condition satisfies it will add the factors to sum
            }
        }
        if(sum == n){
            result = true;
        }
        }
        return result;
    }
}
