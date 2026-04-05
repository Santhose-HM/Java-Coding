package stringsMap;

public class PermutationOfString {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "aaba";

        System.out.println(isPermutation(str1,str2));
    }

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int [] count  = new int [256];

        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();

        for(int i =0;i<str1.length && i < str2.length ;i++){
            count[str1[i]]++;
            count[str2[i]]--;
        }

        for(int frq:count){
            if(frq!=0) return false;
        }
        return true;
    }
}
