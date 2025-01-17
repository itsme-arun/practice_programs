import java.util.*;
public class largearr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); //get size from user
        int[] arr = new int[size];//initializing new array
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();//getting array values from user
        }
        System.out.println(large(arr));
    }

    public static int large(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else{
                max = max;
            }
        }
        return max;
    }
}
