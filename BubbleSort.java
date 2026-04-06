package searchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,5,6};

        System.out.println(Arrays.toString(arr));

        for(int i = arr.length-1;i>=1;i--){
            int flag = 0;
            for(int j =0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
            System.out.println("count");
        }
        System.out.println(Arrays.toString(arr));
    }
}
