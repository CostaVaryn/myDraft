package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Arrays;
import java.util.Scanner;

public class MostCommonCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();
        sc.close();
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int count = 1;
        char symbol = ' ';
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                symbol = arr[i];
                count = 1;
            } else {
                count = 1;
            }
        }
        System.out.println(symbol + " " + max);
    }
}

/*
Вводится единственная непустая строка, состоящая исключительно из букв латинского алфавита и пробелов.
Определить самую часто встречаемую букву и вывести на экран эту букву и количество её вхождений в строку.
Учтите, что буквы могут быть записаны в разном регистре. Если таких букв несколько, то выведите первую по алфавиту.

Примечание
Ответ записывается в нижнем регистре на одной строке через пробел

Sample Input:
a bb a c C c
Sample Output:
c 3
 */