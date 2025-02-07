import java.util.*;

public class WeightofString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String input2 = in.nextLine();
        System.out.println(weight(input1, input2));
    }
    public static int weight(int input1, String input2){
        String answer = input2.replaceAll("[^a-zA-Z]", "").toLowerCase();//removing all the special characters from the input2
        int ans = 0;//for getting ans
        if(input1 == 1){//if input == 1 means calculate all the words weight
            for(int i=0;i<answer.length();i++){
                ans += (answer.charAt(i) - 'a') + 1;// -'a' is used to convert the char to int +1 is used for 1 indexed characters
            }
        }else if(input1 == 0){
            String novowel = answer.replaceAll("[aeiou]", "");//if input == 0 means we need not calculate the value of the vowels so vowels is replaced here
            for(int i=0;i<novowel.length();i++){
                ans += (novowel.charAt(i) - 'a') + 1;//same as above we are adding the values;
            }
        }

        return ans;
    }
}
