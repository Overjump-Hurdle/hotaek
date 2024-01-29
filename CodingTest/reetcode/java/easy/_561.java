package reetcode.java.easy;

import java.util.Arrays;

public class _561 {
    
    public static void main(String[] args){
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }


    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=0; i < nums.length; i += 2){
            result += nums[i];
        }
        return result;
    }
}
