package substring;

public class LongestSubStringAfterChangingKCharacters {
    public static void main(String[] args) {
        int k = 2;
        String s = "ABABA";
        System.out.println("Maximum length = " + longestSubStringAfterChangingKCharacters(s, k));
    }

    public static int longestSubStringAfterChangingKCharacters(String str,int k) {
        int res = 0, n = str.length();

        for(char ch = 'A'; ch<='Z';ch++){
            int i = 0,j = 0, count =0;

            while(j<n){
                if(str.charAt(j) == ch){
                    j++;
                }else if(count<k){
                    j++;
                    count++;
                }else if(str.charAt(i) == ch){
                    i++;
                }else{
                    i++;
                    count--;
                }
            }

            res = Math.max(res,j-i);
        }
        return res;
    }
}
