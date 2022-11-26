package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.HashSet;
import java.util.Scanner;

public class NumberOfUniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j = 0; j < n; j++) {
            hashSet.add(arr[j]);
        }
    }
}

/*
Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.

Sample Input:
7
1 1 2 2 2 3 3
Sample Output:
3
 */