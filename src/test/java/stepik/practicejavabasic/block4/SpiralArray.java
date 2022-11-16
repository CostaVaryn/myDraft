package stepik.practicejavabasic.block4;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for (int[] row : spiral(n, m)) {
            System.out.println(Arrays.toString(row)
                    .replaceAll("^\\[|\\]$", "")
                    .replace(",",""));
        }

    }
    public static int[][] spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }

        return arr;
    }
}
