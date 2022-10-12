package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class DisplayingNumbersDownPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        for (; a >= b; a -= c) {
            System.out.println(a);
        }
    }
}

/*
Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

Входные данные
Заданы три целых числа а, b, с, где a > b

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input:
20
1
2
Sample Output:
20
18
16
14
12
10
8
6
4
2
 */