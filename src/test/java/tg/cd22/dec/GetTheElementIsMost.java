package tg.cd22.dec;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetTheElementIsMost {
    public static void main(String[] args) {
        Stream.of(1,2,12,4,5,6,5,4,3,4,5,4,3,2,3,4,3,2,4,2,3,2,4,4,5,6,3,3,2,2,3,3,4,4,4,4,5,5,5,5,5,5)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
