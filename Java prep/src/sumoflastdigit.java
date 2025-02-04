import java.util.*;
public class sumoflastdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(sumlast(n1, n2));
    }
    public static int sumlast(int n1, int n2){
        int sum =0;
        n1 = n1%10;//it will takes the last digit of the given number
        n2 = n2%10;//it will take the last digit of the given  number
        sum = n1+ n2;//adding both last digits
        return sum;
    }
}
