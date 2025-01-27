import java.util.Scanner;

public class Greatestofthreenos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = in.nextInt();
        System.out.println("Enter Second number:");
        int b = in.nextInt();
        System.out.println("Enter Third number:");
        int c = in.nextInt();
        System.out.println("Maximum Number is:" + max(a, b, c));
    }
    public static int max(int a, int b, int c){
        int max = a; // initially a is max
        if(b > a && b> c){ //if this condition satisfies b is max
            max = b;
        }else if(c > a && c > b){ //if this condition satisfies c is max
            max = c;
        }
        return max;
    }
}
