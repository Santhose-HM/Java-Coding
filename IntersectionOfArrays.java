package arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,4};
        int[] arr2 = {1,2,3,4};
        System.out.println(intersectionOfArrays(arr1,arr2));
    }
    public static ArrayList<Integer> intersectionOfArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    if (!ans.contains(j)) {
                        ans.add(j);
                    }
                }
            }
        }
        return ans;
    }

}
