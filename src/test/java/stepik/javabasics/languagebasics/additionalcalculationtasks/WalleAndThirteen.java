package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), g = sc.nextInt();
        System.out.println((h*4)+(g*2));
    }
}

/*
ВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей.
Лошадей он насчитал h штук, гусей - g штук.
Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.

Входные данные:
h - количество лошадей
g - количество гусей
Выходные данные:
выведите ответ на задачу

Sample Input 1:
8
4
Sample Output 1:
40
Sample Input 2:
2
3
Sample Output 2:
14
 */