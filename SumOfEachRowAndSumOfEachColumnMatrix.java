package twoDArrays;

public class SumOfEachRowAndSumOfEachColumnMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4},
                {5,6},
        };
        sumOfEachColumnMatrix(arr);
        sumOfEachRowMatrix(arr);
    }
    public static void sumOfEachColumnMatrix(int[][] matrix) {
        int sum  = 0;
        for(int i =0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[j][i];
            }

            System.out.println("The "+(i+1)+" column sum is : "+sum);
            sum=0;
        }
    }

    public static void sumOfEachRowMatrix(int[][] matrix) {
        int sum  = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }

            System.out.println("The "+(i+1)+" row sum is : "+sum);
            sum=0;
        }
    }
}
