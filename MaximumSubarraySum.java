package kadanesAlgorithm;

import java.util.ArrayList;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(arr));
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for(int num:nums){
            currentSum+=num;
            maxSum = Math.max(maxSum,currentSum);

            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static ArrayList<Integer> maxSubArray(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        int maxSum = nums[0];
        int currentSum = 0;
        for(int i =0; i<nums.length;i++){
            currentSum+=nums[i];
            result.add(nums[i]);
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum = 0;
                result.clear();
            }
        }

        return result;
    }
}
