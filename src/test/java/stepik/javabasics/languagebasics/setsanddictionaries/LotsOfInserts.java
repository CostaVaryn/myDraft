package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.ArrayList;
import java.util.Scanner;

public class LotsOfInserts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i, Integer.toString(i + 1));
        }
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int num = sc.nextInt();
            int index = sc.nextInt();
            arrayList.add(index, Integer.toString(num));
        }
        System.out.println(String.join(" ", arrayList));
    }
}

/*
Создайте список, содержащий строковые представления первых n натуральных чисел.
Затем добавьте в список k элементов на нужные позиции.

Входные данные:

На первой строчке вводится число n, на второй число k. Затем вводится k пар чисел.
В каждой паре первое число - объект, который надо вставить в список, а второе - индекс,
куда его нужно вставить, гарантируется, что все индексы корректны.

Выходные данные:

Выведите полученный список на экран через пробел.

Sample Input:
5
3
3 0
4 2
9 5

Sample Output:
3 1 4 2 3 9 4 5
 */