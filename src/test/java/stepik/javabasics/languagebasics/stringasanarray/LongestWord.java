package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int big = Integer.MIN_VALUE;
        for (String word : arr) {
            if (word.length() > big) {
                big = word.length();
            }
        }
        System.out.println(big);
    }
}

/*
Вводится единственная строка без знаков препинания. Определите длину самого длинного слова в ней.

Sample Input:
Это самое длинное слово здесь
Sample Output:
7
 */