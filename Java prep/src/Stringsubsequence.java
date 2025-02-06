//Number of Strings That Appear as Substrings in Word
public class Stringsubsequence {
    public static void main(String[] args) {
        String[] arr = new String[] {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(arr, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count =0;
        String sub = "";
        int n = patterns.length;
        for(int i=0;i<n;i++){
            sub = patterns[i];
            if(word.contains(sub)){//if the String word contains all values of the array string it will increase the count
                count++;
            }
        }
        return count;
    }
}
