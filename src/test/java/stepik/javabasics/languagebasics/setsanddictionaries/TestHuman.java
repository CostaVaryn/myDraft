package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.HashMap;

public class TestHuman {
    public static void main(String[] args) {

        HashMap<String, String> human = new HashMap<String, String>();
        human.put("name", "Wlad");
        human.put("secondName", "Kowalew");
        human.put("age", "25");
        human.put("proffesion", "teacher");

        System.out.println("-----------------------------");
        System.out.println("Size: " + human.size());
        System.out.println(human.isEmpty() ? "empty" : "not empty");
        System.out.println(human.getOrDefault("age", "None"));
        System.out.println(human.getOrDefault("Rge", "None"));
        System.out.println("-----------------------------");

        for (String key: human.keySet()){
            System.out.println(key + ": " + human.get(key));
        }
        human.remove("name");
        System.out.println("-----------------------------");
        for (String key: human.keySet()){
            System.out.println(key + ": " + human.get(key));
        }
    }
}
