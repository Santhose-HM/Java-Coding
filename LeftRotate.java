package arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateLeft(arr, 3)));
    }

    public static int[] rotateLeft(int[] nums, int k) {
        for(int i = 0;i<k;i++){
            int temp = nums[i];
            for(int j =1;j<nums.length;j++){
                nums[j-1] = nums[j];
            }
            nums[nums.length-1] = temp;
        }
        return nums;
    }
}
