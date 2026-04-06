package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        permutate(0,nums,list);
        System.out.println(list);
    }

    public static void permutate(int index, int nums[], List<List<Integer>>result){
            if(index == nums.length){
                List<Integer> list = new ArrayList<>();
                for(int i :nums) list.add(i);
                result.add(list);
                return;
            }

            for(int i= index;i<nums.length;i++){
                swap(nums,i,index);
                permutate(index+1,nums,result);
                swap(nums,i,index);
            }
    }

    public static void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
