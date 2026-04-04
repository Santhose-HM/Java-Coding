package PrefixSum;

import java.util.Arrays;

public class RangeSumQueries {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int [] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(prefix));
        System.out.println(rangeQueries(prefix,1,3));
        System.out.println(rangeQueries(prefix,2,4));

    }

    public  static int rangeQueries (int []arr,int i, int j){
        if( i == 0)
            return arr[j];
        return arr[j]-arr[i-1];
    }
}
