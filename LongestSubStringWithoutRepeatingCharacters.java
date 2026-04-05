package substring;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
            String str  = "geeksforgeeks";
            System.out.println("Longest SubString Without Repeating Characters : "+longestSubStringWithoutRepeatingCharacters(str));
    }

    public static int longestSubStringWithoutRepeatingCharacters(String s) {
        int res = 0;
        boolean [] visualizedCharacters = new boolean[26];

        int left  = 0, right = 0;

        while(right<s.length()){
            while(visualizedCharacters[s.charAt(right) - 'a']){
                visualizedCharacters[s.charAt(left)-'a'] = false;
                left++;
            }
            visualizedCharacters[s.charAt(right)-'a'] = true;

            res = Math.max(res,right-left+1);
            right++;
        }

        return res;
    }
}
