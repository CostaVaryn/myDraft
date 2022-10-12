package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class Multy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long multi = 1;
        for (int i = 1; i <= n; i++) {
            long a = sc.nextLong();
                multi *= a;
        }
        System.out.println(multi);
    }
}

/*
Составьте программу, которая запрашивает ввод n чисел и считает их произведение.

Входные данные
На первой строке вводится натуральное число n. Затем вводится n строк, на каждой из которых находится ровно одно целое число.

Выходные данные
Выведите единственное число - ответ на задачу.

Примечание
В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.

Sample Input 1:
3
2
5
7
Sample Output 1:
70

Sample Input 2:
4
2
78
0
23
Sample Output 2:
0
 */