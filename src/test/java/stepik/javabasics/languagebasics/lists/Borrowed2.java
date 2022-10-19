package stepik.javabasics.languagebasics.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Borrowed2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        String[] strings = new String[n];
        sc.nextLine();
        String name = "";
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
            if (strings[i].contains("Добавить")) {
                System.out.println(strings[i].substring(strings[i].indexOf(" ")).trim() + " в очереди");
                list.add(strings[i].substring(strings[i].indexOf(" ")).trim());
            } else if (strings[i].contains("Следующий!")) {
                if (list.size() == 0) {
                    System.out.println("Отлично, попью чаёк!");
                } else {
                    name = list.get(0);
                    System.out.println(list.get(0) + " в обработке");
                    list.remove(0);
                }
            }
            else if (strings[i].contains("занимал")) {
                String name1 = strings[i].substring(0,strings[i].indexOf(" ")).trim();
                String name2 = strings[i].substring(strings[i].lastIndexOf(" ")).trim();
                if (name2.equals(name)) {
                    list.add(0, name1);
                } else if ((!list.contains(name2)) && (!name2.equals(name))) {
                    list.add(name1);
                    System.out.println(name1 + ", не надо тут ля-ля");
                } else {
                    list.add(list.indexOf(name2) + 1,name1);
                }
            } else if (strings[i].contains("Посмотреть очередь")) {
                if (list.size() == 0) {
                    System.out.println("*прокатилось перекати-поле*");
                } else {
                    System.out.println(String.join(" ", list).trim());
                }
            } else if (strings[i].contains("Стоит ли оно того?")) {
                if (list.size() < 5) {
                    list.add(strings[i].substring(strings[i].lastIndexOf(" ")).trim());
                }
                else System.out.println("Слабак!");
            }
        }
    }
}

/*
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ.
Сначала водится число n - количество запросов в вашей программе.
Каждый из запросов будет иметь один следующих видов:

"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди.
Вывести на экран фразу "<ИМЯ> в очереди"
"Следующий!" - вызвали человека, следующего первым по очереди.
При этом человек с именем ИМЯ уходит из очереди и на экране появляется строка вида "<ИМЯ> в обработке".
"<ИМЯ1> занимала/занимал за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2.
Если этот человек сейчас находится в обработке, то ИМЯ1 становится в начало очереди.
Если такого человека в очереди нет, то ИМЯ1 становится в конец списка,
при этом в консоль выводится фраза "<ИМЯ1, не надо тут ля-ля>".
"Посмотреть очередь" - на экран в консоль выводится вся очередь через пробел.
"Стоит ли оно того? <ИМЯ>" - человек с именем ИМЯ смотрит на очередь, если в ней сейчас меньше 5 человек,
то он становится в конец очереди, если нет - то уходит, а в консоли появляется надпись "Слабак!"
Помимо этого, если вызывают следующего человека, а в очереди никого нет,
то вывести в консоль фразу "Отлично, попью чаёк!".
Если очередь пуста, а её пытаются вывести на экран, то следует вывести "*прокатилось перекати-поле*"

Sample Input:
15
Добавить Игорь
Добавить Антон
Добавить Катя
Лиза занимала за Игорь
Посмотреть очередь
Стоит ли оно того? Вася
Следующий!
Следующий!
Валя занимала за Игорь
Следующий!
Следующий!
Посмотреть очередь
Следующий!
Следующий!
Следующий!

Sample Output:
Игорь в очереди
Антон в очереди
Катя в очереди
Игорь Лиза Антон Катя
Игорь в обработке
Лиза в обработке
Валя, не надо тут ля-ля
Антон в обработке
Катя в обработке
Вася Валя
Вася в обработке
Валя в обработке
Отлично, попью чаёк!
 */