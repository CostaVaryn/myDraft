package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        sc.close();
        if ((n * m > k) && (k <= 30000) && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

Sample Input 1:
3 2 4
Sample Output 1:
YES
Sample Input 2:
3 2 1
Sample Output 2:
NO
 */