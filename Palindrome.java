package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        if( isPalindrome(str.toLowerCase(),0,str.length()-1)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }

    public static boolean isPalindrome(String s,int left,int right){
        if(left>=right) return true;

        if(s.charAt(left)!=s.charAt(right)) return false;

        return isPalindrome(s,left+1,right-1);

    }
}
