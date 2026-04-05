package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,2,2};
        System.out.println(removeDuplicates(arr));
    }

    public static ArrayList<Integer> removeDuplicates(int[]nums){
        int leftPosition = 0;
        int rightPosition = nums.length-1;

        ArrayList<Integer> result = new ArrayList<>();

        while(leftPosition<rightPosition){
            if(nums[leftPosition]!=nums[rightPosition]){
               if(!result.contains(nums[leftPosition])){
                   result.add(nums[leftPosition]);
               }
                if(!result.contains(nums[rightPosition])){
                    result.add(nums[rightPosition]);
                }
            }
            leftPosition++;
            rightPosition--;
        }
        if(result.isEmpty()){
            result.add(nums[0]);
        }
        Collections.sort(result);
        return result;
    }

}
