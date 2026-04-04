package hashmap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapTraversal {
    public static void main(String[] args) {
        HashMap<String,String> professionMap = new HashMap<>();
        for(int i =0;i<5;i++){
            Scanner input = new Scanner(System.in);
            String userName = input.next();
            String professionName = input.next();
            professionMap.put(userName,professionName);
        }
        System.out.println("=======================================");
        System.out.println("Access using KeySet");
        for(String key:professionMap.keySet()){
            System.out.println(key+":"+professionMap.get(key));
        }
        System.out.println("=======================================");
        System.out.println("Access using EntrySet");
        for(Map.Entry<String,String>entry:professionMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
