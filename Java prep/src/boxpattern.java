import java.util.*;
public class boxpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        pattern(n, m);
    }
    public static void pattern(int n, int m){
        for(int i=0;i<n;i++){//this is for rows
            for(int j=0;j<m;j++){//this is for columns
                System.out.print(j+1+" " );
            }
            System.out.println("");
        }
    }
}
