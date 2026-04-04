package arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int [] array = {1,4,2,6};
        if(isSorted(array)){
            System.out.println("The Array is sorted");
        }else{
            System.out.println("The Array is not sorted");
        }
    }

    public static boolean isSorted(int[] array){
        for(int i = 0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                   return false;
                }
        }
        return true;
    }
}
