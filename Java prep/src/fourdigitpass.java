import java.util.Scanner;

public class fourdigitpass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=in.nextInt();
        int c =in.nextInt();
        System.out.println(pass(a,b, c));
    }
    public static int pass(int input1, int input2, int input3){
        int max =0;
        int ones =0;
        int tens =0;
        int hundreds =0;
        int temp1 = input1%10;
        int temp2 = input2%10;
        int temp3 = input3%10;
        int temp4 = (input1/10)%10;
        int temp5 = (input2/10)%10;
        int temp6 = (input3/10)%10;
        int temp7 = input1/100;
        int temp8 = input2/100;
        int temp9 = input3/100;
        int temp10= Math.min(temp1, temp2);
        ones = Math.min(temp3, temp10);//value to be placed at ones place
        int temp11 = Math.min(temp4, temp5);
        tens = Math.min(temp6, temp11);//value to be placed at tens place
        int temp12 = Math.min(temp7,temp8);
        hundreds = Math.min(temp9,temp12);//value to be placed in hundreds place
        max = Math.max(temp1, temp2);
        max = Math.max(max, temp3);
        max = Math.max(max, temp4);
        max = Math.max(max, temp5);
        max = Math.max(max, temp6);
        max = Math.max(max, temp7);
        max = Math.max(max, temp8);
        max = Math.max(max, temp9);//value to be placed in thousands place
        return (max*1000) + (hundreds*100) + (tens*10) + ones;//used to generate the fourdigit number with the finded numbers
    }
}


