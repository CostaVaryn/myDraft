package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class Cutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt();
        int a = (n / k) * (2 * m);
        if (n % k > 0)
            a = a + (2 * m);
        if (n > k && n % k <= k / 2)
            a -= m;
        System.out.print(a);
    }
}

/*
На сковородку одновременно можно положить k котлет.
Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно.
За какое наименьшее время удастся поджарить с обеих сторон n котлет?

Входные данные
Вводятся 3 числа: k, m и n. Все числа не превосходят 32000.

Выходные данные
Вывести время, за которое все котлеты будут обжарены.

Sample Input 1:
1
5
1
Sample Output 1:
10
Sample Input 2:
2
4
3
Sample Output 2:
12
 */