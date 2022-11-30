package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), t = sc.nextInt();
        sc.close();
        int s = v * t;
        System.out.println((109 + s % 109) % 109);
    }
}

/*
Длина Московской кольцевой автомобильной дороги — 109 километров.
Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
На какой отметке он остановится через t часов?

Программа получает на вход значения v и t.
Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.

Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.

Sample Input 1:
60
2
Sample Output 1:
11
Sample Input 2:
-1
1
Sample Output 2:
108
 */