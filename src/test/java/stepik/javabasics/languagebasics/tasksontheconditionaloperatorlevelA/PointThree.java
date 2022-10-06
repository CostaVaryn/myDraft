package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class PointThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if ((y > (2*x)) && (y < (3*x))) {
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
1
-2.1
Sample Output 2:
Yes
 */