package PrefixSum;

import java.util.HashMap;

public class SubArraysSumEqualToK {
    public static void main(String[] args) {
        int [] arr = {1,4,1,5,2};
        int k = 6;

        System.out.println("The sub array sum count is : "+subArraySumCount(arr,k));
    }

    public static int subArraySumCount(int[]arr,int k){
        int currentSum = 0;
        int result = 0;


        HashMap<Integer,Integer> map = new HashMap<>();

        //{1,4,1,5,2}; k=6

        for(int i =0;i<arr.length;i++){
            currentSum += arr[i];

            if(currentSum == k){
                result ++;
            }

            if(map.containsKey(currentSum - k)){
                result+=map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }

        return  result;
    }
}
