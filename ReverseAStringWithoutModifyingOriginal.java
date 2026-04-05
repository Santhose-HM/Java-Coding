package strings;

public class ReverseAStringWithoutModifyingOriginal {
    public static void main(String[] args) {
        String originalInput = "Santhose";
        String reverseStringWithoutModifyingOriginal = new StringBuilder(originalInput).reverse().toString();
        System.out.println("Original String: " + originalInput);
        System.out.println("Reversed String: " + reverseStringWithoutModifyingOriginal);
    }
}
