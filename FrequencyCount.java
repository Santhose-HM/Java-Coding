package hashmap;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int [] array = {2,1,5,3,1,6,1,4,1};
        HashMap<Integer,Integer> frequencyCount = new HashMap<>();

        for(int value:array){
            frequencyCount.put(value,frequencyCount.getOrDefault(value,0)+1);
        }

        frequencyCount.forEach((key,value)->{
            System.out.println(key+":"+value);
        });


        System.out.println(frequencyCount.get(1));
        System.out.println(frequencyCount.remove(2));
        System.out.println(frequencyCount.containsKey(3));
        System.out.println(frequencyCount.containsValue(4));
        System.out.println(frequencyCount.isEmpty());
        System.out.println(frequencyCount.size());
    }
}
