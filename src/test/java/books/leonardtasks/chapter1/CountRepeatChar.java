package books.leonardtasks.chapter1;

import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatChar {
    public Map<Character, Long> countDuplicateCharacters(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}

// Подсчет повторяющихся символов