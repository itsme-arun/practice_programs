//Find the index of the first occurrence of a target element in an array
import java.util.*;

public class firstoccurenceoftarget {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int N = in.nextInt();//size of the array
        System.out.print("Enter array values: ");
        int arr[] = new int[N];//initializing the new array named 'arr'
        for(int i=0;i<N;i++){//for loop for getting array values from user as input
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = in.nextInt();//user input : target value
        System.out.println("Index of target is : " + firstoccurence(arr, target));//calling the method
    }
    public static int firstoccurence(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){//if the array of the index is equal to the target it will return i that is the index of that number
                return i;
            }
        }
        return -1;//if not it will return -1
    }
}
