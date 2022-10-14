package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array1 = new double[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextDouble();
        }
        double[] array2 = new double[n];
        for (int j = 0; j < n; j++) {
            array2[j] = sc.nextDouble();
        }
        sc.close();
        for (int k = 0; k < n; k++) {
            System.out.println(array1[k] + array2[k]);
        }
    }
}

/*
Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.

Sample Input:
5
-3 2.5 3.47 86 1.2
1 -2 5 -12.5 4

Sample Output:
-2.0
0.5
8.47
73.5
5.2
 */