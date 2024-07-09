package string;

import java.util.Arrays;

public class Anagram {

    public static void areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println(s1 + " " + "and" + " " + s2 + " " + "are not anagram");
        } else {
            char[] chars = s1.toCharArray();
            char[] chars1 = s2.toCharArray();

            Arrays.sort(chars);
            Arrays.sort(chars1);
            Arrays.equals(chars, chars1);
            System.out.println("Is Anagram");
        }
    }


    public static void main(String[] args) {
        Anagram.areAnagram("liste", "silent");
    }
}

