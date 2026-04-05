package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 2;
        System.out.print(fibonacciSeries(n)+" ");
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
    }

    public static int fibonacciSeries(int n){
        if( n == 0) return 0 ;
        if(n == 1) return 1;

        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}
