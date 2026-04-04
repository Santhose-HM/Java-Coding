package hashset;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetTraversal {
    public static void main(String[] args) {
        HashSet<Integer> hasSet = new HashSet<Integer>();
        for(int i = 0;i<5;i++){
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            hasSet.add(value);
        }

        try {
            for(int value:hasSet){
                System.out.print(value+" ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        hasSet.add(100);
        for(int value:hasSet){
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println(hasSet.size());
        hasSet.remove(100);
        for(int value:hasSet){
            System.out.print(value+" ");
        }
        System.out.println();
        hasSet.toArray();
        for(int value:hasSet){
            System.out.print(value+" ");
        }
    }
}
