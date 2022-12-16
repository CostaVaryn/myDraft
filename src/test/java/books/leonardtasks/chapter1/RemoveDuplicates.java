package books.leonardtasks.chapter1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        return Arrays.asList(str.split(" ")).stream()
                .distinct ()
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("ad block pls ad wir"));
    }
}

// Удаление повторяющихся символов