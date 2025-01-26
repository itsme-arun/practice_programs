import java.util.Scanner;
public class comparatoroftwonumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number");
        int num2 = in.nextInt();
        compare(num1, num2);
    }
    public static void compare(int num1, int num2){
        System.out.println(num1 + " < " + num2 +":"+(num1<num2));//comparing and return true or false "less than opeartor"
        System.out.println(num1 + " > " + num2 +":"+(num1>num2));//greater than operator
        System.out.println(num1 + " <= " + num2 +":"+(num1<=num2));//less than or equal to operator
        System.out.println(num1 + " >= " + num2 +":"+(num1>=num2));//greate rthan or equal to operator
        System.out.println(num1 + " == " + num2 +":"+(num1==num2));//equal to operator
        System.out.println(num1 + " != " + num2 +":"+(num1!=num2));//not equal to operator
    }
}
