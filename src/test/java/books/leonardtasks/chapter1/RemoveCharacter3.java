package books.leonardtasks.chapter1;

import java.util.stream.Collectors;

public class RemoveCharacter3 {
    public static String removeCharacter(String str, String ch) {
        int codePoint = ch.codePointAt(0);
        return str.codePoints()
                .filter(c ->    c != codePoint)
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(removeCharacter("ad block pls ad wir", " "));
    }
}
