package stringsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length()) return ans;

        int[]pCount = new int[26];
        int []windowCount = new int[26];

        for(char c:p.toCharArray()){
            pCount[c-'a']++;
        }

        int windowSize = p.length();
        for(int i=0;i<s.length();i++){
            windowCount[s.charAt(i)-'a']++;

            if(i>=
                    windowSize){
                windowCount[s.charAt(i-windowSize)-'a']--;
            }

            if(Arrays.equals(pCount,windowCount)){
                ans.add(i-windowSize+1);
            }
        }
        return ans;
    }
}
