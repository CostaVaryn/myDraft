package books.leonardtasks.chapter1;

import java.util.stream.Collectors;

public class RemoveCharacter2 {
    public static String removeCharacter(String str, char ch) {
        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(removeCharacter("ad block pls ad wir", 'd'));
    }
}
