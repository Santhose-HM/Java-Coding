package slidingWindow;

public class MaxSubarrayOfSizeK {
    public static void main(String[] args) {
        int [] arr ={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        System.out.println(maxSubarray(arr,k));
    }

    public static int maxSubarray(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i = 0; i < nums.length; i++){
            windowSum += nums[i];
        }
        maxSum = windowSum;
        for(int i = k;i<nums.length;i++){
            windowSum = windowSum + nums[i];
            windowSum = windowSum - nums[i];

            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
