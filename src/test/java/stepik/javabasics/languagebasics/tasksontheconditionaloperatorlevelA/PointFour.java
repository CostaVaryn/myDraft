package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class PointFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        sc.close();
        if ((y < ((x * x) - 3)) && ((y * y) <= (5 - (x * x)))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
Вводятся два действительных числа: координаты точки на плоскости.
Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No".

Примечание: границы не являются частью закрашенной области.

Sample Input 1:
1
1
Sample Output 1:
No
Sample Input 2:
2
-0.1
Sample Output 2:
Yes
 */