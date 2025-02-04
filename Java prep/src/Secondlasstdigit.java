import java.util.Scanner;
public class Secondlasstdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(secondlast(n));
    }
    public static int secondlast(int n){
        n = (n%100)/10;//mod of 100 will return last digit and dividing them by 10 will return the second last digit
        return n;
    }
}
