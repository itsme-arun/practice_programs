import java.util.*;

public class divideby27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(isdivideby27(N));
  }
    public static boolean isdivideby27(int N){
        if(N % 27 == 0) return true; //check whether the number divided by 27 or not
        else return false;
    }
}
