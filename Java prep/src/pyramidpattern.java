import java.util.*;
public class pyramidpattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = n;i>=1;i--){//Outer loop for rows
            for(int j = 1;j<=i;j++){
                System.out.print(j);//Inner loop for numbers in each row
            }
            System.out.println("");//Move to the next line
        }
    }
}
