package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;

        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for(int value = 0; value<5;value++){
            Scanner input = new Scanner(System.in);
            int arrayValue = input.nextInt();
            integerList.add(arrayValue);
        }

        for(int value: integerList){
            if(value%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        System.out.println("Odd Count in an array : "+oddCount);
        System.out.println("Even Count in an array : "+evenCount);
    }
}
