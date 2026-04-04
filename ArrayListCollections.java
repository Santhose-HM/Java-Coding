package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i<5;i++){
            Scanner input = new Scanner(System.in);
            integerList.add(input.nextInt());
        }

        Collections.sort(integerList);
        System.out.println(integerList);

        Collections.sort(integerList,(valueOne,valueTwo)-> valueTwo-valueOne);
        System.out.println(integerList);
    }
}
