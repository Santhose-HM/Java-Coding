package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int value = 0; value<5;value++){
            Scanner input = new Scanner(System.in);
            int arrayValue = input.nextInt();
            integerList.add(arrayValue);
        }

        for(int value :integerList){
            sum+=value;
        }

        System.out.println("The Sum of the Array : "+sum);
    }
}
