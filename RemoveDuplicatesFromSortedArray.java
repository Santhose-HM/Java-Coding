package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();

        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(11);
        arrayList.add(15);
        arrayList.add(20);

        System.out.println(removeDuplicates(arrayList));
    }

    public  static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        return result;
    }
}
