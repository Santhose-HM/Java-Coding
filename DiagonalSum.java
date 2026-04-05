package twoDArrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int [][] arr1 ={
                {1,2,3},
                {5,6,7},
                {8,9,10},
        };

        System.out.println("The diagonal sum is: "+diagonalSum(arr1));
    }
    public static int diagonalSum(int [][] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i][i];
            sum+= arr[i][arr.length-i-1];

        }

        if(arr.length%2==0){
            sum-=arr[arr.length/2][arr.length/2];
        }
        return sum;
    }
}
