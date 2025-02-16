import java.util.Scanner;
public class curlypattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        pattern(row);
    }
    public static void  pattern(int row){
        char open = '{';
        char close = '}';
        for(int i = 1;i<=row;i++){//to iterate over rows
            for(int j =0;j<i;j++){//to iterate columns
                for(int k =0;k<=j;k++){//to print open brackets
                    System.out.print(open + " ");
                }
                for(int l =0;l<=j;l++){//to print close brackets
                    System.out.print(close + " ");
                }
                System.out.print(" ");//to print space for each iteration in column
            }
            System.out.println();
        }
    }

}
