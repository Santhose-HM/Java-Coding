    package twoDArrays;

    import java.util.Arrays;

    public class TransposeOfMatrix {
        public static void main(String[] args) {
            int [][] arr ={
                    {1,2,3,4},
                    {5,6,7,8},
            };
            System.out.println(Arrays.deepToString(transpose(arr)));
        }
        public static int[][] transpose(int[][] arr){
            int rows = arr.length;
            int cols = arr[0].length;

            int [][] transposeMatrix = new int[cols][rows];

            for(int i=0;i<rows;i++){
                for(int j =0;j<cols;j++){
                    transposeMatrix[j][i] = arr[i][j];
                }
            }

            return transposeMatrix;
        }
    }
