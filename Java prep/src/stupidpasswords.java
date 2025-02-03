//.Write a program that enters two integers n and l and generates, in alphabetical order, all possible "stupid” passwords" that consist of the following 5 characters:
//
//Character 1: a digit from 1 to n.
//Character 2: a digit from 1 to n.
//Character 3: a small letter from the first l letters of the Latin alphabet.
//Character 4: a small letter from the first l letters of the Latin alphabet.
//Character 5: a digit from 1 to n, greater than the first 2 digits.
//Input Data
//The input is read from the console and consists of two integers: n and l within the range [1 … 9], each on a single line.
//
//Output Data
//Print on the console all "stupid" passwords in alphabetical order, separated by space
import java.util.*;
public class stupidpasswords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        for(int d1 =1;d1<=n;d1++){//first digit from 1 to n
            for(int d2 = 1;d2<=n;d2++){//second digit from 1 to n
                for(char ch1 = 'a';ch1<='a'+l;ch1++){//character at 3rd position from a to int l
                    for(char ch2 = 'a';ch2<= 'a'+l;ch2++){//character at 4th position from a to int l
                        for(int d3 = d1+1;d3<=n;d3++){//last digit which is greater than the first two digits
                            System.out.print(" "+d1+d2+ch1+ch2+d3+" ");//printing all
                        }
                    }
                }
            }
        }
    }
}
