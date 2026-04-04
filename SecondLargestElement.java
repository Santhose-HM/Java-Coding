package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr [] = {12,43,76,4,13};
        System.out.println("The Second Largest Element is  : "+secondLargestElementInArray(arr));
    }

    public static int secondLargestElementInArray(int[]array){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0;i< array.length;i++){
            if(array[i]>firstMax){
                secondMax = firstMax;
                firstMax = array[i];

            }else if(array[i]>secondMax && array[i]!=firstMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}
