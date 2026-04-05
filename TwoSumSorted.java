package twoPointers;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15};
        int k = 9;
        System.out.println(Arrays.toString(twoSum(arr,k)));
    }

    public static int[] twoSum(int[]nums,int target){
        int leftPosition = 0;
        int rightPosition = nums.length-1;

        int []resultArray = new int[2];

        while(leftPosition<rightPosition){
            int sum = nums[leftPosition]+nums[rightPosition];
            if(sum == target){
                // if it is  1 based index add 1 to left and right
                resultArray[0] =leftPosition;
                resultArray[1] =rightPosition;
                return resultArray;
            }
            else if(sum<target){
                leftPosition++;
            }
            else{
                rightPosition--;
            }
        }

        return resultArray;
    }
}
