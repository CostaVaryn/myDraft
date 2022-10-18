package stepik.javabasics.languagebasics.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplacingAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.toString(i));
        }
        int m = sc.nextInt();
        String str = sc.next();
        sc.close();
        arrayList.set(m, str);
        for (String strs : arrayList) {
            System.out.print(strs + " ");
        }
    }
}

/*
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m < n) и строку s. Замените строкой s элемент на позиции m.
Выведите список на экран через пробел.

Sample Input:
5
2
Строка
Sample Output:
0 1 Строка 3 4
 */