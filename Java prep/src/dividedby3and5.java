//number which are divided by 5 and 3 between 1 to 100
public class dividedby3and5 {
    public static void main(String[] args){
        System.out.println("Numbers divided by 3 and 5 ");
        for(int i=1;i<=100;i++) {
            if (i % 3 == 0 && i % 5 == 0) { //if the number exactly divided by 3 and 5 means it will be printed in output
                System.out.print(i + " ");
            }
        }System.out.println("");
    }
}
