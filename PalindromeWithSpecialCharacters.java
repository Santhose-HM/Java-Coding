package stringTwoPointers;

public class PalindromeWithSpecialCharacters {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        if(isPalindrome(str.toLowerCase())){
            System.out.println("Given String  is a palindrome.");
        }else{
            System.out.println("Given String  is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(Character.isLetter(str.charAt(left))&& Character.isLetter(str.charAt(right))){
                if(str.charAt(left)==str.charAt(right)){
                    return true;
                }
            }


            left++;
            right--;
        }
        return false;
    }
}
