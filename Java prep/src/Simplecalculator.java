import java.util.*;
public class Simplecalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x!=1) {
        System.out.println("Choose Operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        int N = in.nextInt();
            switch (N) {
                case 1:
                    System.out.println("You Have Choosed Addition ");
                    System.out.println("Enter Numbers : ");
                    int n = in.nextInt();
                    int m = in.nextInt();
                    addition(n, m); //case 1 will add the values
                    continue;//continue for user to choose next next choice

                case 2:
                    System.out.println("You Have Choosed Subtraction ");
                    System.out.println("Enter Numbers : ");
                    int c = in.nextInt();
                    int d = in.nextInt();
                    subtraction(c, d);
                    continue;

                case 3:
                    System.out.println("You Have Choosed Mutiplication ");
                    System.out.println("Enter Numbers : ");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    multiplication(a, b);
                    continue;

                case 4:
                    System.out.println("You Have Choosed Division ");
                    System.out.println("Enter Numbers : ");
                    int e = in.nextInt();
                    int f = in.nextInt();
                    division(e, f);
                    continue;
                case 5:
                    x++;//if 5 pressed means the x will increased to 1 and the while loop will end and the program stop executed
                    break;

            }
            System.out.println("You have Choosen to Exit");
        }

    }
    public static void addition(int a,int b){
        System.out.println("Addition : "+(a + b));
    }
    public static void subtraction(int a, int b){
        System.out.println("Subtraction : "+(a - b));
    }
    public static void multiplication(int a, int b){
        System.out.println("Multiplication : " + (a*b));
    }
    public static void division(int a, int b){
        if(b == 0){
            System.out.println("Division by Zero Not Possible");
        }else System.out.println("Division : " + (a/b));
    }

}
