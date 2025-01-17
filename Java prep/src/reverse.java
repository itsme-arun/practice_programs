//reverse a word
import java.util.Scanner;

public class reverse {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(reversed(name));
    }
    public static String reversed(String name){
        String result = "";
        for(int i=name.length()-1;i>=0;i--){ //iteration takes place from the end of the string
            result+=name.charAt(i);//adding the character at the index i to the string result
        }

        return result;
    }
}
