package searchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {6,8,9,13,14,5};
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<=arr.length-1;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
