import java.util.Scanner;

public class defangingIP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String address = in.nextLine();
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (char c : address.toCharArray()){//for every char in the String to char array
            str.append((c == '.')? "[.]" : c );//appending the value in the String builder
        }
        return str.toString();//returning that as String
    }

}
