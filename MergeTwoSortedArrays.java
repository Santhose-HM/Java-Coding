package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5};
        int [] arr2 = {2,4,6};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        mergedTwoSortedArrays(arr1, arr2);
    }

    public static void mergedTwoSortedArrays(int[] nums1, int[] nums2) {
        int arrayOneLength  = nums1.length;
        int arrayTwoLength = nums2.length;
        int [] mergeArray = new int[arrayOneLength+arrayTwoLength];

        for(int i =0;i<arrayOneLength;i++){
            mergeArray[i] = nums1[i];
        }

        for(int i = 0;i<arrayTwoLength;i++){
            mergeArray[i+arrayOneLength] = nums2[i];
        }

        Arrays.sort(mergeArray);

        for(int i =0;i<arrayOneLength;i++){
            nums1[i] = mergeArray[i];
        }
        for(int i =0 ;i<arrayTwoLength;i++){
            nums2[i] = mergeArray[i+arrayOneLength];
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
