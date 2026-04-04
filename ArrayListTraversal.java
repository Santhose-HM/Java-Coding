package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i<5;i++){
            Scanner input = new Scanner(System.in);
            integerList.add(input.nextInt());
        }

        for(int value:integerList){
            System.out.print(value+" ");
        }
        System.out.println();
        integerList.set(0,100);
        integerList.remove(4);
        for(int value:integerList){
            System.out.print(value+" ");
        }
    }
}
