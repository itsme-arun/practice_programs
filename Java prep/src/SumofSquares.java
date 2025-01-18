import java.util.*;
public class SumofSquares {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sumofsquare(num));
    }
    public static int sumofsquare(int n){
        int sum = ((n)*(n+1 )*(2*n +1)/6);//this can be  done using loop, but using this formula will make efficient for large numbers
        return sum;
    }
}
