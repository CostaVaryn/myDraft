package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class Kindergarten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String redHead = "";
        String wolf = "";
        int maxHeight = 0, minHeight = 0;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int height = sc.nextInt();
                if ((height > maxHeight)) {
                    maxHeight = height;
                    wolf = name;
                } else if ((height < maxHeight) && (minHeight == 0)) {
                    minHeight = height;
                    redHead = name;
                } else if ((height < maxHeight) && (minHeight != 0) && (height < minHeight)) {
                    minHeight = height;
                    redHead = name;
                }

            }
        } else if (n == 1) {
            redHead = sc.next();
            wolf = redHead;
        }
        System.out.println(redHead);
        System.out.println(wolf);
    }
}

/*
Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено выбрать самого
маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка.

На вход программе даётся число n, затем 2*n строк. Каждая пара строк - Имя ребёнка и его рост.
Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка,
который будет играть волка. Если детей одного наименьшего или наибольшего роста несколько,
то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.

В силу специфики работы Scanner для считывания строки используйте именно sc.next();

Sample Input 1:
3
Вася
130
Маша
110
Коля
140
Sample Output 1:
Маша
Коля
Sample Input 2:
4
Алина
120
Вася
140
Маша
110
Коля
140
Sample Output 2:
Маша
Вася
 */