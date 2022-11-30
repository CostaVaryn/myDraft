package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class NextEvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int b = a - (a % 2) + 2;
        System.out.println(b);
    }
}

/*
Дано целое число n. Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.
Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.

Sample Input 1:
5
Sample Output 1:
6
Sample Input 2:
8
Sample Output 2:
10
 */
