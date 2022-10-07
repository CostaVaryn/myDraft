package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class CoordinateQuarters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
        if ((((x1 > 0) && (x2 > 0)) && ((y1 > 0) && (y2 > 0))) ||
                (((x1 < 0) && (x2 < 0)) && ((y1 > 0) && (y2 > 0))) ||
                (((x1 < 0) && (x2 < 0)) && ((y1 < 0) && (y2 < 0))) ||
                (((x1 > 0) && (x2 > 0)) && ((y1 < 0) && (y2 < 0)))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
Даны координаты двух точек на плоскости, требуется определить,
лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).

Входные данные
Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).

Выходные данные
Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.

Sample Input 1:
1 1 2 2
Sample Output 1:
YES
Sample Input 2:
-1 3 4 -5
Sample Output 2:
NO
 */