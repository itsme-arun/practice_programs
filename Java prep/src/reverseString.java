import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");//Spliting each word And Store them in String Array
        StringBuilder result = new StringBuilder();//used to append and store value
        for(int i=arr.length-1;i>=0;i--){
            if(i == 0) result.append(arr[i]);//this is edge case to append without space
            else result.append(arr[i]+" ");//otherwise appending with space
        }
        return new String(result);//returning as String
    }
}
