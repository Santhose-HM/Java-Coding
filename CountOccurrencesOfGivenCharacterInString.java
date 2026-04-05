package patternMatching;

public class CountOccurrencesOfGivenCharacterInString {
    public static void main(String[] args) {
        String str= "geeksforgeeks";
        char c = 'e';
        System.out.println(countOccurrencesOfGivenCharacterInString(str,c));
    }

    public static int countOccurrencesOfGivenCharacterInString(String str, char ch) {
        int count  = 0;
        for(char c:str.toCharArray()){
            if(ch == c){
                count++;
            }
        }
        return count;
    }
}
