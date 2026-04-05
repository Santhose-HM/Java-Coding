package recursion;

public class PrintNumbersFromOneToN {
    public static void main(String[] args) {
        int n = 10;
        printNumbersFromOneToN(n);
    }

    public static void printNumbersFromOneToN(int n) {
        if(n == 0) return;
        printNumbersFromOneToN(n-1);
        System.out.print(n+ " ");
    }
}
