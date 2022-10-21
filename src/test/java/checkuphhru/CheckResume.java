package checkuphhru;

import java.util.*;

public class CheckResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();
        int max = Math.max(n,m);
        int[][] mas = new int[max][2];
        for (int i = 0; i < max; i++) {
            String str = sc.nextLine().replaceAll("-", "0");
            String[] minArr = str.split(" ");
            int a = Integer.parseInt(minArr[0]);
            int b = Integer.parseInt(minArr[1]);
            for (int j = 0; j < 1; j++) {
                mas[i][j] = a;
                mas[i][j+1] = b;
            }
        }
        int sum = 0;
        int maxSum = 0;

        boolean is_need = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < max; j++) {
                sum += mas[j][i];
                if ((sum == max) && (j == n - 1)) {
                    is_need = true;
                }
            }
            //multy = 1;
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mas[i][j]+ " ");
            }
        }
    }
}

/*

3 4 11
1 1
2 2
3 3
- 4
 */