import java.util.Scanner;

public class Fibonaccii {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){  // if the user enters negative value it will execute
            System.out.println("Enter positive Value");
        }else{
            fibo(n);//calling the fibo method
        }

    }
    public static void fibo(int n){
        int first = 0;//first fibonacci number is zero
        int second = 1;//second fibonacci number in one
        int next = 0;
        System.out.print(first+ " ");
        if(n>1){
            System.out.print(second + " ");
        }
        for(int i=2;i<n;i++){
            next = first + second;//adding first and second will give the next number in the fibonacci series
            System.out.print(next + " ");//printing that next number
            first = second;//changing the first value as second
            second = next;//changing the second value as next value "to find next next values up to n"
        }
        System.out.println("");;
    }
}
