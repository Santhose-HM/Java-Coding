package searchingAndSorting;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {4,6,2,5,7,9,1,3};
        int target = 9;
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr,target);
        if(index!=-1){
            System.out.println("The index of the "+target+" is "+index);
        }else{
            System.out.println("The index of the "+target+" is not found");
        }
    }

    public static int binarySearch(int[]arr,int target){
        int low  = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] <target) low = mid+1;
            else high = mid -1;
        }

        return -1;
    }
}
