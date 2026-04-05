package substring;

public class CountSubStringWithUniqueCharacters {
    public static void main(String[] args) {
        String str = "gffg";
        System.out.println("The Sub string with unique character is : "+countSubStrings(str));
    }

    public static int countSubStrings(String s){
        int subStringCount = 0;
        int n = s.length();

        int  i =0, j=0;

        int [] frequencyArray = new int[26];

        while(i<n){
            if(j<n && frequencyArray[s.charAt(j)-'a']==0){
                frequencyArray[s.charAt(j)-'a']++;
                subStringCount+=(j-i+1);
                j++;
            }else{
                frequencyArray[s.charAt(i)-'a']--;
                i++;
            }
        }
        return subStringCount;
    }
}
