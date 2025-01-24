//to check whether the given number is power of 2 or not
import java.util.Scanner;
public class powerof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(pow2(n));
    }
    public static boolean pow2(int n){
        return n>0 && (n&(n-1)) == 0; //return true if n>0 and n&n-1 == 0 this is the method for finding power of 2
                                      //if n = 3 it perform 'and' operation on the number
    }                                 //0011 & 0010 == 2 so false
                                      //n = 8   1000 & 0111 == 0000 = 0 true
}
