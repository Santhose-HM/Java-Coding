package arrays;
import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        int [] array = new int [6];
        for (int i = 0;i <array.length; i++){
            Scanner input = new Scanner(System.in);
            array[i] = input.nextInt();
        }

        for (int value:array){
            System.out.print(value+" ");
        }
    }
}
