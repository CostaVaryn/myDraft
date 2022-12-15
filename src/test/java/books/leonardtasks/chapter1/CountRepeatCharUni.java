package books.leonardtasks.chapter1;

import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatCharUni {
    public static Map<String, Long> countDuplicateCharacters(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj (c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
