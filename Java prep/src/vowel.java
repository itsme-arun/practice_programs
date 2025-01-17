//number of vowels in the word
import java.util.Scanner;

public class vowel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(vowels(word));
    }
    public static int vowels(String word){
        int count = 0;
        String vowe = "aeiouAEIOU";
        for(int i=0;i<word.length();i++){
            if(vowe.indexOf(word.charAt(i))!=-1) {
                count++;
            }else{
                count = count;
            }
        }
        return count;
    }
}
