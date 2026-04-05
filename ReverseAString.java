package recursion;

public class ReverseAString {
    public static void main(String[] args) {
        String a  = "hello"; // ello        // h
                             // llo         // eh
                             // lo          // leh
                             // o           // lleh
                                            // olleh
        System.out.println(reverse(a));
    }
    public static String reverse(String str){
        if(str.isEmpty()) return str;

        return reverse(str.substring(1))+str.charAt(0);
    }
}
