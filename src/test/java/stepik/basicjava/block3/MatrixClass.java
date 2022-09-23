package stepik.basicjava.block3;

import java.util.Arrays;

public class MatrixClass {
    public static void main(String[] args) {
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        //multiply
        int m = m1.length;
        int n = m2[0].length;
        int o = m2.length;
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
