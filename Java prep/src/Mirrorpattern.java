import java.util.*;

public class Mirrorpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //no of rows need to print
        //this is for upper part
        for(int i = 1;i<=n;i++){//for next line
            for(int j=i;j<n;j++){//for printing spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//for printing Stars
                System.out.print("* ");
            }
            System.out.println();
        }
        // this is for lower part
        for(int i=n;i>=1;i--){//reducing Stars
            for(int j=i;j<n;j++){//printing space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
