package stringsMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "aabaaa";
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;

        HashMap<Character,Integer> frequencyMap = new HashMap<Character,Integer>();

        for(char c : str1.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c : str2.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)-1);
        }

        for(var pair :frequencyMap.entrySet()){
            if(pair.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
