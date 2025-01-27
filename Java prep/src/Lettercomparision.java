import java.util.Scanner;

public class Lettercomparision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Letter:");
        char a = in.nextLine().charAt(0);
        System.out.println("Enter Letter:");
        char b = in.nextLine().charAt(0);
        max(a, b);
    }
    public static void max(char a, char b){
        if(a < b){ //condition to check 
            System.out.println(b + " is Max");
        }else{
            System.out.println(a +" is Max");
        }
    }
}
