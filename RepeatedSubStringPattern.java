package patternMatching;

public class RepeatedSubStringPattern {
    public static void main(String[] args) {
        System.out.println(isRepeated("abab"));       // true
        System.out.println(isRepeated("aba"));        // false
        System.out.println(isRepeated("abcabcabc"));  // true
    }

    public static boolean isRepeated(String str){
        int n = str.length();
        int [] lps = computeLps(str);
        int len = lps[n-1];

        return(len>0 && n%(n-len)==0);
    }

    public static int [] computeLps(String str){
        int m = str.length();
        int i = 1, len = 0;

        int[]lps = new int[m];

        while(i<m){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
