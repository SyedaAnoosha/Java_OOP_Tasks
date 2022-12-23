package practice_tasks;

import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) throws NullPointerException {
        int[] z=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target-nums[i+1]){
                Arrays.fill(z, i);
            }
        }
        return z;
    }
}
public class PracticeLeetCode1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[] arr={1,2,3,4};
        Solution S1= new Solution();
        System.out.println(Arrays.toString(S1.twoSum(arr, 5)));
    }
}
