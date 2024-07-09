package array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "white"};
        Arrays.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }

    }
}
