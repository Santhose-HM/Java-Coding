package arrays;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the search Number");
        Scanner input = new Scanner(System.in);
        int searchNumber = input.nextInt();

        int [] array = {12,54,78,44,1,5};

        if(linearSearch(array,searchNumber) == -1){
            System.out.println("Invalid Search Number");
        }else{
            System.out.println("Elements is found in the index : "+linearSearch(array,searchNumber));
        }

    }

    public static int linearSearch(int[] array,int searchNumber){
        for(int i = 0; i<array.length;i++){
            if(array[i] == searchNumber){
                return i;
            }
        }
        return -1;
    }
}
