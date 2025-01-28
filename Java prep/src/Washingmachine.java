import java.util.*;

public class Washingmachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Weight : ");
        int weight = in.nextInt();
        System.out.print("Enter Level : ");
        char level = in.next().charAt(0);
        washingtime(weight, level);
    }
    public static void washingtime(int weight, char level){
        if(weight == 0){ //if weight equal to zero it will return this statement
            System.out.println("Time Estimated: 0 minutes");
        }else if(weight<0){ //if weight is a negative number means it will executes this
            System.out.println("INVALID INPUT");
        }
        else if(weight<=2000 && level == 'L'){ //if both conditions satisfied means it will execute
            System.out.println("Time Estimated: 25 minutes");
        }else if(weight >= 2001 && weight<=4000 && level == 'M'){
            System.out.println("Time Estimated: 35 minutes");
        }else if(weight >= 4001 && weight<=7000 && level == 'H'){
            System.out.println("time Estimated: 45 minutes");
        }else if(weight>7000){ //if the weight is greater than 7000 it prints overloaded
            System.out.println("OVERLOADED");
        }else{
            System.out.println("INVALID INPUT");
        }
    }
}
