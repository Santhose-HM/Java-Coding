package twoDArrays;

public class LargestElementInTwoDArray {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
        };
        System.out.println(largestElementInTwoDArrays(arr));
    }

    public static int largestElementInTwoDArrays(int[][] matrix) {
        int maxValue = matrix[0][0];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>maxValue){
                    maxValue=matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}
