package hardtask.colle;

import java.util.ArrayList;
import java.util.List;

public class MainDraft5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);

        System.out.println("--------------------------------------------------------");
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println("--------------------------------------------------------");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        list.stream().sorted().distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        list.stream().map(x -> x * x).forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
    }
}
