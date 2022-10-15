package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag_0 = true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr.length; u++) {
                if (arr[i] == arr[u] && i != u) {
                    flag_0 = false;
                    break;
                }
            }
            if (flag_0) {
                System.out.println(arr[i]);
            }
            flag_0 = true;
        }
    }
}

/*
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
 */