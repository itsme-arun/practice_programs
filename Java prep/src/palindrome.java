//check whether the given string is palindrome or not
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if(ispalindrome(word)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean  ispalindrome(String word){
        word = word.toLowerCase();
        boolean name = false;
        for(int i=0;i<word.length();i++){  //iteration from start
            for(int j=word.length()-1;j>=0;j--) { //iteration from end
                if (word.charAt(i) == word.charAt(j)){ // comparing both start and end
                    name = true;
                }else{
                    name = false;
                }
            }
        }
        return name;
    }
}
