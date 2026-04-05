package stringTwoPointers;

public class ValidPalindromeAfterRemovingOneChar {
    public static void main(String[] args) {
        String s  = "abcbea";
        int index = possiblePlainByRemoveOneChar(s.toLowerCase());
        if(index == -1){
            System.out.println("Not possible");
        } else if (index == -2) {
            System.out.println("Possible without removing any character");
        }else{
            System.out.println("Possible by removing the character at : "+index);
        }

    }
    public static boolean isPalindrome(String s,int left,int right) {
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int possiblePlainByRemoveOneChar(String s){
        int left  = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                if(isPalindrome(s,left+1,right)){
                    return left;
                }
                if(isPalindrome(s,left,right-1)){
                    return right;
                }
                return -1;
            }
        }
        return -2;
    }
}
