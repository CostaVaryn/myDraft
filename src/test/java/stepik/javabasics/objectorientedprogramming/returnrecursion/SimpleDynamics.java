package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class SimpleDynamics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(rec(n));
    }
    public static long rec(long n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;
        return rec(n-3) + rec(n-2) + rec(n-1);
    }
}

/*
На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
(То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
Определить число всевозможных "маршрутов" мячика с вершины на землю.

Подсказка: Если ваша программа работает слишком долго, то может использовать кеш?

Sample Input 1:
3
Sample Output 1:
4

Sample Input 2:
10
Sample Output 2:
274
 */