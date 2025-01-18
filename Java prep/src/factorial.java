import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("Factorial of the given number is: ");
        System.out.println(fact(number));//calling the fact method
    }
    public static int fact(int num){
        int result =1;//initializing the result value as 1
        for(int i=1;i<=num;i++){
            result *= i;//performing multiplication of each number up to the given number
        }
        return result;//finally returning the result
    }
}
