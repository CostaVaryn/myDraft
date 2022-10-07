package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class Horse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
        if (((x1 - 1 == x2) || (x1 + 1 == x2)) && ((y1 - 2 == y2) || (y1 + 2 == y2))) {
            System.out.println("YES");
        } else if (((x1 - 2 == x2) || (x1 + 2 == x2)) && ((y1 - 1 == y2) || (y1 + 1 == y2))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами
(номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры
(два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:
3 4 5 6
Sample Output 1:
NO
Sample Input 2:
7 3 5 4
Sample Output 2:
YES
 */