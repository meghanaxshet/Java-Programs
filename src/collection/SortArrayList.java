package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(80);
        num.add(34);
        num.add(23);
        num.add(38);
        num.add(12);
        num.add(45);
        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(i) > num.get(j)) {
                    int temp = num.get(i);
                    num.set(i, num.get(j));
                    num.set(j, temp);
                }
            }

        }
        System.out.println("The sorted elements are : " + num);
    }
}
