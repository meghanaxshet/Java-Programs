package string;

import java.util.Arrays;

public class Anagram {

    public static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] chars = s1.toCharArray();
            char[] chars1 = s2.toCharArray();

            Arrays.sort(chars);
            Arrays.sort(chars1);
            return Arrays.equals(chars, chars1);

        }
    }


    public static void main(String[] args) {
        System.out.println(areAnagram("listen", "silent"));
        System.out.println(areAnagram("unity", "unit"));
    }
}

