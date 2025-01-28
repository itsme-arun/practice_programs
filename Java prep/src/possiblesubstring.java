import java.util.Scanner;
public class possiblesubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String word = in.nextLine();
        sub(word);
    }
    public static void sub(String word){
        for(int i=0;i<word.length();i++){//loop for start char
            for(int j = i+1;j<=word.length();j++){//loop for end char
                System.out.println(word.substring(i, j));//substring  used to print from start to end except end
            }
        }
    }
}
