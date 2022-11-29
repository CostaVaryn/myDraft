package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(a,i);
        }
        System.out.println(sum);
    }
}

/*
По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an,
не используя формулу суммы геометрической прогрессии. Время работы программы должно быть пропорционально n.

Входные данные
Вводятся 2 числа - a и n.

Выходные данные
Необходимо вывести значение суммы.

Sample Input:
2
2
Sample Output:
7
 */