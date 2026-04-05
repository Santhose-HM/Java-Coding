package twoDArrays;

import java.util.Arrays;
import java.util.Collections;

public class RotateMatrixNintyDegree {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
        };

        System.out.println(Arrays.deepToString(rotate(arr)));
    }

    public static int[][] rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        for(int j=0;j<transposeMatrix.length;j++){
               int left =0;
               int right = transposeMatrix[j].length-1;

               while(left<right){
                   int temp = transposeMatrix[j][left];
                   transposeMatrix[j][left] = transposeMatrix[j][right];
                   transposeMatrix[j][right] = temp;

                   left++;
                   right--;
               }
        }
        return transposeMatrix;
    }
}
