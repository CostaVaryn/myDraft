package stepik.javabasics.languagebasics.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovingAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.toString(i));
        }
        int m = sc.nextInt();
        sc.close();
        arrayList.remove(m);
        for (String strs : arrayList) {
            System.out.print(strs + " ");
        }
    }
}

/*
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m < n). Удалите элемент на позиции m.
Выведите список на экран через пробел.

Sample Input:
5
2
Sample Output:
0 1 3 4
 */