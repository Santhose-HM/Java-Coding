package stringTwoPointers;

public class PalindromePermutation {
    public static void main(String[] args) {

    }

    public static boolean canFromAPalindrome(String s){
        int mask  = 0;
        for(int i=0;i<s.length();i++){
            int bit =s.charAt(i) - 'a';
            mask^=(1<<bit);
        }
        return (mask == 0) ||((mask&(mask-1))==0);
    }
}
