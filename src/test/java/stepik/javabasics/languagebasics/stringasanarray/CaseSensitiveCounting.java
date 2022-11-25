package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class CaseSensitiveCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = str.replaceAll("[^f]", "").length();
        System.out.println(count);
    }
}

/*
Вводится строка, найдите, сколько раз в ней встречается буква "f".
Подсчитайте количество вхождений только "маленькой буквы".

Sample Input:
Good morning my dear friend. This is fish.

Sample Output:
2
 */