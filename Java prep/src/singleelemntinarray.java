//Given a non-empty array of integers nums, every element appears twice except for one. Find
//that single one.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//Input: nums = [1]
import java.util.*;
public class singleelemntinarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,5,4,3,3,2,2};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum ^= arr[i];//XOR of same values become to zero so the single value will remain
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
