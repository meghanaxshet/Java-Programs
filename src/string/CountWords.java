package string;

public class CountWords {
    public static void main(String[] args) {
        String words = "Just a word count";
        int wordCount = words.split(" ").length;
        System.out.println(wordCount);
    }
}
