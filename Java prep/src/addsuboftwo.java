import java.util.Scanner;

public class addsuboftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number");
        int num2 = in.nextInt();
        addsub(num1, num2);
    }
    public static void addsub(int a, int b){
        int sum = Math.abs(a+b);//store the absolute value of a + b
        int sub = Math.abs(a-b);//stores the absolute value of a-b
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : "+ sub);
    }
}
