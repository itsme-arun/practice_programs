import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        int p = in.nextInt();
        System.out.print("Enter Years: ");
        int n = in.nextInt();
        System.out.print("Enter Rate Of Interest: ");
        int r = in.nextInt();
        System.out.println("Simple Interest: "+si(p, n, r));
    }
    public static int si(int p, int n, int r){
        int SimpleInterest = (p*n*r)/100;//formula for calculating Simple Interest
        return SimpleInterest;
    }
}
