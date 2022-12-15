package books.leonardtasks.chapter1;

public class ContainsOnlyDigits {
    public static boolean containsOnlyDigits(String str) {
        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }
}
