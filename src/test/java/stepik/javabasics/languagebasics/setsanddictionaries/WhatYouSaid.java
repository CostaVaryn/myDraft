package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.HashMap;
import java.util.Scanner;

public class WhatYouSaid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, String> words = new HashMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            words.put(i, str);
        }
        sc.close();
        int count = 0;
        int max = 0;
        String answer = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    answer = words.get(i);
                }
            }
            count = 0;
        }
        System.out.println(answer);
    }
}

/*
Вводится натуральное число n, затем n слов на разных строках.
Определите, какое слово встречается чаще всего.
Гарантируется, что такое слово одно.
Все слова вводятся в нижнем регистре на русском языке.

Sample Input 1:
6
да
я
прикалывался
просто
да
успокойся
Sample Output 1:
да

Sample Input 2:
10
просто
будь
собой
просто
будь
весел
просто
будь
добр
будь
Sample Output 2:
будь
 */