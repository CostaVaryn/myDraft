package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.HashSet;
import java.util.Scanner;

public class HasTheNumberBeenSeenBefore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j = 0; j < n; j++) {
            System.out.println(hashSet.add(arr[j]) ? "NO" : "YES");
        }
    }
}

/*
Вводится число n, затем n целых чисел.
Для каждого числа выведите слово YES (в отдельной строке),
если это число ранее встречалось в последовательности или NO, если не встречалось.

Sample Input:
6
1 2 3 2 3 4

Sample Output:
NO
NO
NO
YES
YES
NO
 */