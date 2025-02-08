import java.util.Scanner;

public class Weightofhillpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int Start = in.nextInt();
        int increment = in.nextInt();
        System.out.println(hillweight(row, Start, increment));

    }
    public static int hillweight(int input1, int input2, int input3){
        int ans = input2;
        int sum = input2;
        for(int i=1;i<input1;i++){
            sum += input3;//for incrementing in each Step
            ans += sum * (i+1);//for hill pattern in Each Step
        }
        return ans;
    }
}
