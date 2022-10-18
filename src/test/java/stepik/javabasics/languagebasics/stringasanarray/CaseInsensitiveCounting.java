package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class CaseInsensitiveCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine().toLowerCase();
        String x = sc.next().toLowerCase();
        sc.close();
        String[] array = str.split("");
        for (String s : array) {
            if (s.contains(x)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}

/*
Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита.
Найдите, сколько раз в тексте встречается введённый символ в любом регистре.
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:
Good morning my dear friend. My fish.
m
Sample Output:
3
 */