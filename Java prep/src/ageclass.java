import java.util.*;
//.Age Group Classification: Write a Java program that takes an age as input and prints the corresponding age group:
//
//0-12: Child
//13-19: Teenager
//20-64: Adult
//65 and above:Senior
public class ageclass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        ageclassification(age);
    }
    public static void ageclassification(int age){
        if(age<0){
            System.out.println("Enter positive Number");
        }
        else if(age>= 0 && age<=12){
            System.out.println("Child");
        }else if(age>= 13 && age<=19){
            System.out.println("Teenager");
        }else if(age>= 20 && age<=64){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}
