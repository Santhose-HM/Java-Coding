package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfArrays {
    public static void main (String[] args) {
        int[] arr1 = {1,2,1,4};
        int[] arr2 = {1,2,3,4};
        System.out.println(unionOfArrays(arr1,arr2));
    }

    public static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr1){
            if (!list.contains(i)){
                list.add(i);
            }
        }
        for(int i:arr2){
            if (!list.contains(i)){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
