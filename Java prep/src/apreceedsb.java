import java.util.*;

public class apreceedsb {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String word = in.nextLine();//User input
        System.out.println(ispreceed(word));//calling the method
    }
    public static boolean ispreceed(String word){
        boolean b= false;//initializing b as false
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);//initializing the character which contains the i th index character
            if(c == 'b'){//this will execute if the String contains 'b'
                b = true;//after finding 'b' changing boolean b to true
            }else if(b!=false && c == 'a'){//this will return false when b present in the string and character c is 'a'
                return false;
            }
        }
        return true;//otherwise it will return true
    }
}
