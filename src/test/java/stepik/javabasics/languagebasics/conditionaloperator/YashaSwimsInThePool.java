package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class YashaSwimsInThePool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        int z = N - x;
        int k = M - y;
        if (x < y && x < z && x < k) {
            System.out.println(x);
        } else if (y < x && y < z && y < k) {
            System.out.println(y);
        } else if (z < x && z < y && z < k) {
            System.out.println(z);
        } else if (k < x && k < y && k < z) {
            System.out.println(k);
        }
    }
}

/*
Яша плавал в бассейне размером N×M метров и устал.
В этот момент он обнаружил, что находится на расстоянии x метров от одного из длинных бортиков
(не обязательно от ближайшего) и y метров от одного из коротких бортиков.
Какое минимальное расстояние должен проплыть Яша, чтобы выбраться из бассейна на бортик?

Входные данные
Программа получает на вход числа N, M, x, y.

Выходные данные
Программа должна вывести число метров, которое нужно проплыть Яше до бортика.

Sample Input 1:
23
52
8
43
Sample Output 1:
8

Sample Input 2:
18
90
3
63
Sample Output 2:
3
 */