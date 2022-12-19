package books.leonardtasks.chapter1;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWords2 {
    private static final Pattern PATTERN = Pattern.compile(" +");
    public static String reverseWords(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining (" "));
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString ();
    }
    public static void main(String[] args) {
        String str = "asd dsssw wq";
        System.out.println(reverseWords(str));
        System.out.println(reverse(str));
    }
}
