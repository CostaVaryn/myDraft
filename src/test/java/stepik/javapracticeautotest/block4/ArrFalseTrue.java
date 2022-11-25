package stepik.javapracticeautotest.block4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrFalseTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arrStr = str.split(" ");
        int[] numArr = new int[n];
        for (int j = 0; j < n; j++) {
            numArr[j] = Integer.parseInt(arrStr[j]);
        }
        //int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] booArr = new boolean[n];
        if (n >= 2) {
            Arrays.fill(booArr,false);
            for (int i = 0; i < n; i++) {
                if (i >= 1 && i < n - 1) {
                    if (numArr[i] + numArr[i - 1] == numArr[i + 1]) {
                        booArr[i + 1] = true;
                    }
                }
            }
        } else {
            Arrays.fill(booArr,false);
        }
        System.out.println(Arrays.toString(booArr));
    }
}

/*
Напишите программу, которая должна получить размер массива и сам массив значений int
и вернуть массив логических значений, где каждый элемент является результатом проверки:
является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.

Подробности:

Длина входящего массива должна быть 2 или более.
Метод возвращает массив логических значений, где каждый элемент
является результатом для соответствующего элемента в данном массиве.
Первые два элемента логического массива всегда false.

Sample Input:
8
1 -1 0 4 6 10 15 27

Sample Output:
[false, false, true, false, false, true, false, false]
 */