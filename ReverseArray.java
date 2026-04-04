package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int value = 0; value<5;value++){
            Scanner input = new Scanner(System.in);
            int arrayValue = input.nextInt();
            integerList.add(arrayValue);
        }
        System.out.println(integerList);
        System.out.println(reverseArray(integerList));
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer>array){
        for(int value =0;value<array.size()/2;value++){
            int temp = array.get(value);
            array.set(value,array.get(array.size()-value-1));
            array.set(array.size()-value-1,temp);
        }

        return array;
    }
}
