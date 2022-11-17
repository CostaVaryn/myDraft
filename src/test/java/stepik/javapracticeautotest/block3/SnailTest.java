package stepik.javapracticeautotest.block3;

import java.util.Scanner;

public class SnailTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int start = 0, day = 0;
        sc.close();
        if (a <= b && a < h) {
            System.out.println("Никогда");
        } else {
            for (int i = 1; start <= h; i++) {
                start += a;
                if (start >= h) {
                    day = i;
                    break;
                }
                start -= b;
            }
            System.out.println(day);
        }
    }
}

/*
Дано следующее условие: улитка поднимается по дереву на a метров в день.
Затем каждую ночь улитка сползает вниз на b метров. Высота дерева — h метров.

Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.

Программа читает a, b, h построчно. Входные значения гарантированно являются положительными целыми числами.

Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Никогда.

Sample Input:
4
2
14

Sample Output:
6
 */