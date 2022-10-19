package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PersonneStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> words = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String prof = sc.next();
            words.put(name, prof);
        }
        int count = 0;
        int max = 0;
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    answer = words.get(i);
                }
            }
            count = 0;
        }
        System.out.println(answer);
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