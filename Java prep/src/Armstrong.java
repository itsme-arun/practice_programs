import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = in.nextInt();
        System.out.print("The Given Number is ");
        if(isArmstrong(num)){   //calling the isArmstrong Method
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an Armstrong");
        }
    }
    //this method return true if the given number is Armstrong
    public static boolean isArmstrong(int num){
        int originalnum = num;
        int sum =0;
        int digits = String.valueOf(num).length();//used to find the total number of digits in the given number
        while( num > 0){
            int digit = num % 10;//finding from last digit
            sum += Math.pow(digit,  digits);//Adding it after taking the power of each digits
            num = num/10;//remove the last digit after adding it to the sum
        }
        return originalnum == sum; //if originalnum is equal to sum it will return true
    }
}
