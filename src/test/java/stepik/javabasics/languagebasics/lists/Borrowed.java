package stepik.javabasics.languagebasics.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Borrowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String name = null;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equalsIgnoreCase("Добавить")) {
                list.add(sc.next());
            } if (str.equalsIgnoreCase("Следующий!")) {
                list.remove(0);
            }
            if (!str.equalsIgnoreCase("Добавить") && !str.equalsIgnoreCase("Следующий!")) {
                sc.next();
                sc.next();
                name = sc.next();
                int index = list.indexOf(name);
                list.add(index + 1, str);
            }
        }
        System.out.println(String.join(" ", list));
    }
}

/*
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ.
Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди
"Следующий!" - вызвали человека, следующего первым по очереди. При этом человек с именем ИМЯ уходит из очереди.
"<ИМЯ1> занимала за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2.
Гарантируется, что человек, за которым занимали очередь стоит в ней.
Гарантируется, что все люди имеют различные имена и при вызове следующего человека, очередь не пуста.

Выведите на экран через пробел очередь после совершения всех запросов.

Sample Input:
5
Добавить Лена
Добавить Коля
Марина занимала за Лена
Следующий!
Добавить Игорь
Sample Output:
Марина Коля Игорь
 */