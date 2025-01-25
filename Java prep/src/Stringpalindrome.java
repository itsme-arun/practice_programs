import java.util.*;

public class Stringpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str = in.nextLine();
        System.out.println(ispalindrome(Str));
    }
    public static boolean ispalindrome(String str){
        boolean result = false;
        str.toLowerCase();//convert all character to lower case
        char[] res= str.toCharArray();//converting the String to the character array
        for(int i=0;i<res.length;i++){//iterate from start
            for(int j= res.length-1;j>=0;j--){//iterate from end
                if(res[i] == res[j]){ // comparing start and last
                    result = true;
                }else{
                    result = false;
                }
            }
        }
        return result;
    }
}
