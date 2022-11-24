package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class ArrangeThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (c <= b && b <= a) {
            System.out.println(c + " " + b + " " + a);
        } else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else {
            System.out.println(c + " " + a + " " + b);
        }
    }
}

/*
Дано три числа, записанный в отдельных строках.
Упорядочите их в порядке неубывания.
Программа должна считывать три числа a, b, c,
затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c,
затем программа выводит тройку a, b, c.

Входные данные
Вводятся три числа, каждое записано в отдельной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input 1:
2
6
-4
Sample Output 1:
-4 2 6
Sample Input 2:
2
3
4
Sample Output 2:
2 3 4
 */