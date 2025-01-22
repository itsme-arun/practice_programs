import java.util.*;
public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sum(N));
    }
    public static int sum(int n){
        int ans = n * (n+1)/2;//formula for efficent method O(1). this also done using loop but it takes O(n) complexity
        return ans;
    }
}
