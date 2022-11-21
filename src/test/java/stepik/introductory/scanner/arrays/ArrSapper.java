package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrSapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            arr[x - 1][y - 1] = 1 ;
        //System.out.print(arr[x - 1][y - 1] + " ");
        }
        sc.close();

        for (int i = 0 ; i < m; i++) {
            StringBuilder builder  = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    builder.append("m" + " ");
                } else {
                    int leftX = i == 0 ? 0 : i - 1;
                    int rightX = i + 1 >= m ? i : i + 1;
                    int topY = j == 0 ? 0 : j - 1;
                    int bottomY = j + 1 >= n ? j : j + 1;
                    int minesQty = 0;
                    for (int l = leftX; l <= rightX; l++) {
                        for (int o = topY; o <= bottomY; o++) {
                            if (!(l == i && o == j) && arr[l][o] == 1) {
                                minesQty++;
                            }
                        }
                    }
                    builder.append(minesQty + " ");
                }
            }
            System.out.println(builder.toString().trim());
        }
    }
}

/*
 * Заполните поле для игры Сапёр.
 * На вход подаются натуральные числа m и n - размеры игрового поля, затем k - количество мин,
 * далее координаты мин - x и y для каждой мины, нумерация координат начинается с единицы.
 * Необходимо вывести на печать игровое поле:
 * - если в клетке расположена мина, выведите для этой клетки "m" (латиница);
 * - если в клетке мины нет, нужно посчитать, сколько мин расположено в соседних клетках (включая угловые и боковые),
 * и вывести для этой клетки посчитанное число.
 *
 * Примечание. Каждая строка оканчивается символом (не пробелом!).
 *
 * Sample Input 1:
 * 3 2
 * 3
 * 1 1
 * 2 2
 * 3 2
 * Sample Output 1:
 * m 2
 * 3 m
 * 2 m
 *
 * Sample Input 2:
 * 3 3
 * 1
 * 1 1
 * Sample Output 2:
 * m 1 0
 * 1 1 0
 * 0 0 0
 */