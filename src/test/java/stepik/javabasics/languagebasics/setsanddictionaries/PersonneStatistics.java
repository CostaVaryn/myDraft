package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.*;

public class PersonneStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        LinkedHashMap<String, String> prof = new LinkedHashMap<String,String>();
        int n = in.nextInt(), count = 0;
        String line, answer = "", name;
        for (int i = 0; i < n; i++) {
            name = in.next();
            line = in.next();
            prof.put(name, line);
            if (map.containsKey(line)) {
                map.put(line, map.get(line) + 1);
            } else {
                map.put(line, 1);
            }
            if (count < map.get(line)) {
                count = map.get(line);
                answer = line;
            }
        }
        System.out.println(count);
        System.out.println(answer);
        for (String str: prof.keySet()) {
            if (answer.equals(prof.get(str))) {
                System.out.println(str);
            }
        }
    }
}

/*
Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия.
Определите, сотрудников какой профессии больше всего.
Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились.
Гарантируется, что будет введено не более 100 сотрудников.

Sample Input:
7
Иван
Токарь
Семён
Программист
Анатолий
Кузнец
Вася
Финансист
Кирилл
Программист
Оля
Программист
Валера
Токарь

Sample Output:
3
Программист
Семён
Кирилл
Оля
 */