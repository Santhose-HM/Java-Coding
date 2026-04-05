package stringTwoPointers;

public class CountPalindromicSubString {
    public static void main(String[] args) {
        String str = "abaab";
        System.out.println(countPS(str.toLowerCase()));
    }

    public static boolean isPalindrome(String str,int left,int right) {
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int countPS(String str){
        int n = str.length();

        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isPalindrome(str,i,j)){
                    res++;
                }
            }
        }
        return res;
    }
}
