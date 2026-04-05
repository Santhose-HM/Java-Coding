package strings;

public class DifferenceBetweenDoubleEqualToAndEquals {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = new String(firstString);

        System.out.println("Using == "+(firstString==secondString));
        System.out.println("Using equals method "+(firstString.equals(secondString)));
    }
}
