package tg.cd23.jan;

import java.util.HashMap;
import java.util.Iterator;

public class FinClassExample {
    private final int age;
    private final String name;
    private final HashMap<String, String> addresses;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getAddresses() {
        return (HashMap<String, String>) addresses.clone();
    }

    public FinClassExample(int age, String name, HashMap<String, String> addresses) {
        System.out.println("Выполняется глубокое сканирование в конструкторе");
        this.age = age;
        this.name = name;
        HashMap<String, String> temporaryMap = new HashMap<>();
        String key;
        Iterator<String> iterator = addresses.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            temporaryMap.put(key, addresses.get(key));
        }
        this.addresses = temporaryMap;
    }
}
