import java.util.*;
public class substring {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();//String input
        int start = in.nextInt();//User input for starting index
        int end = in.nextInt();//User input for ending index
        System.out.println(substring(word, start, end));//calling the method
    }
    public static String substring(String word, int start, int end){
        String out = word.substring(start, end);//Stores the substring from start index to end-1 index
        return out;
    }
}
