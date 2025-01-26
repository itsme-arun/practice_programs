//Imagine you have two mysterious numbers. Your task is to write a program that
//reveals which one of them is the bigger one. How will you solve this puzzle?

import java.util.Scanner;
public class mysteriousnumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int  num1 = in.nextInt();
        System.out.print("Enter Second number:");
        int num2 = in.nextInt();
        max(num1, num2);
    }
    public static void max(int num1, int num2){
        if(num1>num2){ // condition to compare the numbers
            System.out.println("First Number is Greater");
        }else if(num1<num2){ //condition to compare the numbers
            System.out.println("Second number is Greater");
        }else{ //it will execute if both the numbers are equal
            System.out.println("Both are equal");
        }
    }
}