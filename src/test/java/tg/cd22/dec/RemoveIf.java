package tg.cd22.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        numbers.removeIf(s -> s > 5);
        numbers.forEach(s -> System.out.println(s + " "));
    }
}
