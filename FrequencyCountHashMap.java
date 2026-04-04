package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountHashMap {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,5,3,1,5,2};
        HashMap<Integer,Integer> frequencyCount = new HashMap<>();
        for(int value:arr){
            frequencyCount.put(value,frequencyCount.getOrDefault(value,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:frequencyCount.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
