package arrays;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateRight(arr, 3)));
    }

    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        for(int i =0 ;i<k;i++){
            int right = arr[n-1];
            for(int j = n-1;j>i;j--){
                arr[j] = arr[j-1];
            }
            arr[i] = right;
        }

        return arr;
    }
}
