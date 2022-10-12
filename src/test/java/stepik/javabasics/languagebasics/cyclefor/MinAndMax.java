package stepik.javabasics.languagebasics.cyclefor;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}

/*
Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
Необходимо определить и вывести на экран минимальное и максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное
значения часто используются -2*109 и 2*109 соответственно.
Но в олимпиадных задачах всегда смотрите на ограничения по числам
(в них всегда оговорены границы, в которых будут лежать значения переменных).

Sample Input:
5
6
10
-7
13
4
Sample Output:
-7
13
 */