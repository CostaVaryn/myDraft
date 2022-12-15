package books.leonardtasks.chapter1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class CountVowelsAndConsonants2 {
    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static Long countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(partitioningBy(c -> allVowels.contains(c), counting()));
        return result.get(true);
    }
}

// Подсчет гласных и согласных