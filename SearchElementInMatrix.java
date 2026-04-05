package twoDArrays;

public class SearchElementInMatrix {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
        };
        int target = 5;

       if(searchMatrix(arr,target)==-1){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }

    public static int searchMatrix(int[][] matrix, int target){
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    return 1;
                }
            }
        }

        return -1;
    }

}
