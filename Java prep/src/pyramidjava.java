import java.util.Scanner;

public class pyramidjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        pattern(n, m);
    }
    public static void pattern(int n, int m){
        for(int i=0;i<n;i++){//this is for rows
            for(int s=0;s<n-i-1;s++){
                System.out.print("   ");
            }for(int j=1;j<=i*2+1;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
