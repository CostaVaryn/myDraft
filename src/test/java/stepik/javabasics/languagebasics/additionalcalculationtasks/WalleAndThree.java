package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tX = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        int line = (x * tX) * 2;
        int tY = (line / 2) / y;
        System.out.println(tX + tY);
    }
}

/*
Робот ВАЛЛ-И решил отправиться в соседний город.
Половину пути он проехал за t часов со скоростью x км/ч , а остальное расстояние со скоростью y км/ч.
Рассчитайте, сколько времени ВАЛЛ-И был в пути.

Входные данные:
Построчно вводятся 3 целых неотрицательных числа:

t - время, затраченное на первую половину пути
x - скорость на первой половине пути
y - скорость на второй половине пути
Гарантируется, что ВАЛЛ-И проехал целое число часов!!!

Выходные данные:
выведите одно единственное число - время, которое ВАЛЛ-И был в пути.

Sample Input 1:
2
60
30
Sample Output 1:
6
Sample Input 2:
5
30
50
Sample Output 2:
8
 */
