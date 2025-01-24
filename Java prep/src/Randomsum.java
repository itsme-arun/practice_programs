import java.util.Random;
public class Randomsum {
    public static void main(String[] args) {
        Random random = new Random();//calls the util package
        int n1 = random.nextInt(100);//random number is generated between 0 to 100
        int n2 = random.nextInt(100);
        int sum = n1 + n2;
        System.out.println("number 1 :" + n1);
        System.out.println("number 2 :"+ n2);
        System.out.println("Sum :"+ sum);
    }
}
