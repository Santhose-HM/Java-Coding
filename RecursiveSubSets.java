package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSubSets {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();

        subSetHelper(0,arr,new ArrayList<>(),result);
        System.out.println(result);
    }

    public static void subSetHelper(int index, int[] arr, List<Integer>current,List<List<Integer>> result){
        result.add(new ArrayList<Integer>(current));

        for(int i = index;i<arr.length;i++){
            current.add(arr[i]);
            subSetHelper(i+1,arr,current,result);
            current.remove(current.size()-1);
        }
    }
}
