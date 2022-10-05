package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class YashaSwimsInThePool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int resNx = N - x;
        int resMy = M - y;
        int result = Math.min(Math.min(resNx,x),Math.min(resMy,y));
        System.out.println(result);
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