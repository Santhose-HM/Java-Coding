package stringTwoPointers;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(getLongestPalindromicSubstring(s));
    }
    public static boolean isPalindrome(String str,int i,int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String getLongestPalindromicSubstring(String str){
        int n = str.length();
        int maxLen = 1, start = 0;

        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                if(isPalindrome(str,i,j) && (j-i+1)>maxLen){
                    start  =i;
                    maxLen = j-i+1;
                }
            }
        }
        return str.substring(start,start+maxLen);
    }
}
