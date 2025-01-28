import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = in.nextInt();
        leap(year);
    }
    public static void leap(int year){
        if(year % 4 == 0 && (year%400 == 0 || year % 100!=0)){//condition to check normal years and centuries like 1900 etc
            System.out.println("It is Leap year");
        }else{
            System.out.println("It is not a Leap year");
        }
    }
}
