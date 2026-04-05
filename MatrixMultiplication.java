package twoDArrays;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] arr1 ={
                {1,2,3,4},
                {5,6,7,8},
        };

        int [][] arr2 ={
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };

        int [][]res = new int[arr1.length][arr2[0].length];

        System.out.println(Arrays.deepToString(multiply(arr1,arr2,res)));

    }

    public static int[][] multiply(int[][] A, int[][] B, int[][] res) {
        int rowOne = A.length;
        int colOne = A[0].length;
        int rowTwo = B.length;
        int colTwo = B[0].length;

        if (colOne != rowTwo) {
            System.out.println("Invalid Input");
            System.exit(1);
        }


        for(int i=0;i<rowOne;i++){
            for(int j=0;j<colTwo;j++){
                res[i][j]=0;
                for(int k=0;k<colOne;k++){
                    res[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        return res;
    }
}
