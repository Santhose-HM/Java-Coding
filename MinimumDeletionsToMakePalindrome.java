package stringTwoPointers;

public class MinimumDeletionsToMakePalindrome {
    public static void main(String[] args) {
        String str = "aebcbda";
        System.out.println(minDeletions(str.toLowerCase()));
    }


    public static int minRecursion(int i,int j, String s){
        if(i>=j) return 0;
        if(s.charAt(i)==s.charAt(j)){
            return minRecursion(i+1,j-1,s);
        }
        return 1+Math.min(minRecursion(i+1,j,s),minRecursion(i,j-1,s));
    }

    public static int minDeletions(String s){
        int n =  s.length();
        return minRecursion(0,n-1,s);
    }
}
