package books.leonardtasks.chapter1;

import java.util.stream.IntStream;

public class PermuteAndPrintStream {
    private static void permuteAndPrintStream(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrintStream(prefix + str.charAt(i),
                            str.substring(i + 1, n) + str.substring(0, i)));
        }
    }
    public static void main(String[] args) {
        permuteAndPrintStream("", "POST");
    }
}
