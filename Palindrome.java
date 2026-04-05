package stringTwoPointers;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        if(isPalindrome(str.toLowerCase())){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right  = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
