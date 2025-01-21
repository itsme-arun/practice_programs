import java.util.Scanner;

//Maximum Number of Words Found in Sentences
public class maxsentence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter The Sentences :");
        for(int i=0;i<n;i++){
            arr[i] = in.nextLine();//getting array values as sentences
        }
        System.out.println(max(arr));
    }
    public static int max(String[] arr){
        int result =0;
        for(int i=0;i<arr.length;i++){
            String sentence = arr[i];//taking the i th sentence
            String[] count = sentence.trim().split("\\s+");//split them by spaces and store them in new String array
            if(count.length>result){ // compares all sentence length and stores the max length
                result = count.length;//stores the max length of the array
            }
        }
        return result;//return result
    }

}
