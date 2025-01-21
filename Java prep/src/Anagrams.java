//Check two Strings are Anagrams or Not

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if(isAnagram(a, b)){   //Calling the method
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
    public static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){  //if lengths mismatch means it will return false
            return false;
        }
        HashMap<Character, Integer> ak = new HashMap<>();//Hashmap is used to store the frequency of the String
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            ak.put(c, ak.getOrDefault(c, 0)+1);//if c already contains means it will increment the prev by 1 else default value 0 will be added
        }
        for(int i=0;i<b.length();i++){
            char c = b.charAt(i);
            if(!ak.containsKey(c)){ // if the char does not present in hashmap it will return false
                return false;
            }
            ak.put(c, ak.get(c)-1);//if char contains in the hashmap means it will decrement the frequency
            if(ak.get(c)<0){
                return false;//if count goes negative it will return false
            }
        }
        return true;
    }
}