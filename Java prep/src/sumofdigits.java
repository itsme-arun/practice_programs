import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = in.nextInt();
        System.out.print("Sum of Digits of the given Number is : ");
        System.out.println(sumofdigit(num));//calling the sumofdigit Method
    }
    //Method to find the sum of digits
    public static int sumofdigit(int num){
        int sum = 0;
        while(num > 0){
            int dig= num%10;//starting from last digit
            sum += dig;//at first we are adding the last digit of the number
            num = num/10;//after adding that number we are removing that last number
        }
        return sum;//finally returning the total sum of each digits
    }
}
