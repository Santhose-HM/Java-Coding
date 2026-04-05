package patternMatching;

public class IndexOfFirstOccurrences {
    public static void main(String[] args) {
        String text = "gffgfg";
        String pattern = "gfg";

        System.out.println("First occurrence index: " + search(text, pattern));
    }

    public static int search(String str,String pattern){
        int n  = str.length();
        int m = pattern.length();

        int [] lps = computeLPS(pattern);

        int i =0, j=0;
        while(i<n){
            if(str.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return i-j;
            }else if(i<n && str.charAt(i) != pattern.charAt(j)){
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }

    public static int [] computeLPS(String pattern){
        int m = pattern.length();
        int [] lps = new int [m];

        int i = 1, len =0;

        while(i<m){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }
}
