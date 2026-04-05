package PrefixSum;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int []arr = {1,4,1,3,2};
        System.out.println("The equilibrium index is : "+equilibriumIndex(arr));
    }

    public static int equilibriumIndex(int [] arr){
            int n  = arr.length;

            int[]prefixSum = new int[n];
            int[]suffixSum = new int[n];

            prefixSum[0] = arr[0];
            suffixSum[n-1] = arr[n-1];

            for(int i =1;i<n;i++){
                prefixSum[i] = prefixSum[i-1]+arr[i];
            }

            for(int i = n-2;i>=0;i--){
                suffixSum[i] = suffixSum[i+1]+arr[i];
            }

            System.out.println(Arrays.toString(prefixSum));
            System.out.println(Arrays.toString(suffixSum));

            for(int i = 0;i<n;i++){
                if(prefixSum[i]==suffixSum[i]){
                    return i;
                }
            }
            return -1;
    }
}
