package hardtask.colle;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

public class MainDraft4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, RandomStringUtils.randomAlphabetic(10));
            map.putIfAbsent(i + 100, RandomStringUtils.randomAlphabetic(10));
        }
        System.out.println(map);
        //map.clear();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Содержит ключ 10? " + map.containsKey(10));
        System.out.println("Содержит ключ 150? " + map.containsKey(150));
        System.out.println(map.get(77));
        System.out.println(map.getOrDefault(321, "Нет ключа"));
        map.putIfAbsent(101, "JASFpsAsPFKpaSAf");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(map.keySet());
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(map.values());
        System.out.println("----------------------------------------------------------------------------------------");
        map.putAll(map2);
        System.out.println("Map size: " + map.size());
    }
}
