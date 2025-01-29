import java.util.*;
public class Nthprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(primeof(N));
    }
    public static int primeof(int N){
        int count =0;//used to find the nth prime number by exiting while loop at nth prime
        int i=1;
        while(count<N){
            i++;
            if(isprime(i)) count++;//if the number is prime it will increase the count
        }
        return i;
    }
    public static  boolean isprime(int N){
        if(N<2) return false;

        for (int i = 2; i * i <= N; i++) { // Check divisors up to √num
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
