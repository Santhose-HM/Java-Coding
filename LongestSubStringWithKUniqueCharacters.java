package substring;

public class LongestSubStringWithKUniqueCharacters {
    public static void main(String[] args) {
            String str = "aabacbebebe";
            int k  = 3;
            System.out.println("The longest Substring with "+k+" unique elements is : "+longestSubStringWithKUniqueCharacters(str,k));
    }

    public static int longestSubStringWithKUniqueCharacters(String str,int k) {
        int n = str.length();
        int i =0,j=0;
        int count = 0;
        int max = -1;

        int [] frequencyArray  = new int [26];

        while(j<n){
            frequencyArray[str.charAt(j) - 'a']++;

            if(frequencyArray[str.charAt(j) - 'a'] ==  1) count++;

            while(count>k){
                frequencyArray[str.charAt(i) - 'a'] --;

                if(frequencyArray[str.charAt(i) - 'a'] == 0) count --;
                i++;
            }

            if(count == k){
                max = Math.max(max,j-i+1);
            }
            j++;
        }

        return max;
    }
}
