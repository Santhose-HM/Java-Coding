package stringsMap;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = groupAnagrams(strs);
        System.out.println(Arrays.toString(map.values().toArray()));
    }

    public static Map<String, List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();

        for(String s:strs){
            char [] chars  = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagramMap.putIfAbsent(key,new ArrayList<>());
            anagramMap.get(key).add(s);
        }
        return anagramMap;
    }
}
