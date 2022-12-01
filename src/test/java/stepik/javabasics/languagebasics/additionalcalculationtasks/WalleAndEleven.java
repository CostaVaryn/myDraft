package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), v = sc.nextInt();
        sc.close();
        System.out.println((double) s / v);
    }
}

/*
ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу.
По карте он определил расстояние s в километрах и настроил свою скорость равной v км/ч.
Составьте программу, которая поможет ВАЛЛ-И определять время, проводимое в пути.

Входные данные:
s - расстояние
v - скорость
Выходные данные:
выведите ответ на задачу

Sample Input 1:
600
60
Sample Output 1:
10.0
Sample Input 2:
100
20
Sample Output 2:
5.0
 */
