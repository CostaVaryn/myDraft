package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), t = sc.nextInt(), m = sc.nextInt();
        System.out.println((x*t)+(y*m));
    }
}

/*
ВАЛЛ-И и ЕВА решили встретиться и выехали навстречу друг другу.
Скорость ВАЛЛ-И составляет x км/ч, а ЕВЫ - y км/ч. Когда они встретились,
то ВАЛЛ-И сообщил, что был в пути t часов, а ЕВА сказала, что потратила на дорогу m часов.
Составьте программу, которая бы вычислила, какое расстояние было между ВАЛЛ-И и ЕВОЙ в момент их отправления.

Входные данные:
x - скорость ВАЛЛ-И
y - скорость ЕВЫ
t - время ВАЛЛ-И
m - время ЕВЫ
Выходные данные:
выведите ответ на задачу

Sample Input 1:
10
5
2
3
Sample Output 1:
35
Sample Input 2:
60
50
3
4
Sample Output 2:
380
 */