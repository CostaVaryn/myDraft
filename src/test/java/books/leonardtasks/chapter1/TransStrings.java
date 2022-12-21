package books.leonardtasks.chapter1;

import java.util.stream.Stream;

public class TransStrings {

    public static void main(String[] args) {
        String resultMap = Stream.of("hello")
            .map(s -> s + " world")
            .findFirst()
            .get();
        System.out.println(resultMap);
    }
}
