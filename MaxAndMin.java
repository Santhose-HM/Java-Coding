package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int value = 0; value<5;value++){
            Scanner input = new Scanner(System.in);
            int arrayValue = input.nextInt();
            integerList.add(arrayValue);
        }
        System.out.println("Maximum Number in Array : "+maxNumberInArray(integerList));
        System.out.println("Minimum Number in Array : "+minNumberInArray(integerList));
    }

    public static int maxNumberInArray(ArrayList<Integer> array){
        int max = array.get(0);
        for(int num:array){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    public static int minNumberInArray(ArrayList<Integer>array){
        int min = array.get(0);
        for(int num:array){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
}
