package searchingAndSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {4,6,2,5,7,9,1,3};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int partition = partitionIndex(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }

    public static int partitionIndex(int[]arr,int low,int high){
        int pivot = arr[low];
        int  i = low;
        int j = high;

        // Descending Order
//        while(i<j){
//            while(arr[i]>=pivot){
//                i++;
//            }
//            while(arr[j]<pivot){
//                j--;
//            }
//            if(i<j){
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//            }
//        }

        // Ascending Order

        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
