package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String str = Integer.toString(n);
        int val = str.length();
        String[] arr = str.split("");
        int multi = 1;
        for (int i = 0; i < val; i++) {
            int a = Integer.parseInt(arr[i]);
            multi *= a;
        }
        System.out.println(multi);
    }
}

/*
Дано натуральное число. Найдите произведение его цифр.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input:
156
Sample Output:
30
 */