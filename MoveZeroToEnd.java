package arrays;

import java.util.ArrayList;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(0);
        list.add(54);
        list.add(0);
        list.add(4);
        System.out.println(list);
        System.out.println(moveZero(list));

    }
    public static ArrayList<Integer> moveZero(ArrayList<Integer> array) {
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) != 0){
                int temp =  array.get(i);
                array.set(i,array.get(j));
                array.set(j,temp);
                j++;
            }
        }

        return array;
    }
}
