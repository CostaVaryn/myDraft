package stepik.javacore.mainmodule;

import java.util.Scanner;

public class ArrTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1, b = -1;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arrInt = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arrStr = s.split(" ");
            for (int j = 0; j < m; j++) {
                arrInt[i][j] = Integer.parseInt(arrStr[j]);
            }
        }

        int[] rows = new int[n];
        int[] cols = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rows[i] = rows[i] + arrInt[i][j];
                cols[j] = cols[j] + arrInt[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] == cols[j]) {
                    if (a != -1) {
                        System.out.println("ambiguous");
                        return;
                    } else {
                        a = i;
                        b = j;
                    }
                }
            }
        }

        if (a == -1) {
            System.out.println("none");
        } else {
            System.out.println("" + a + " " + b);
        }
    }
}
