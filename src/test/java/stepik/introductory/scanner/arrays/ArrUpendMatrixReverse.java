package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrUpendMatrixReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int k = 0;
        String str = "";
        while(sc.hasNextLine()) {
            String str1 = sc.nextLine();
            str = str + str1 + " ";
            counter++;
        }

        String[] arr = str.split(" ");
        int b = arr.length/counter;
        String[][] matrix = new String[b][counter];
        for (int i = 0 ; i < counter; i++) {
            for (int j = 0 ; j < (arr.length/counter); j++) {
                matrix[j][counter-1-i] = arr[arr.length-1-k];
                k++;
            }
        }

        for (String[]i: matrix) {
            int z = 1;
            for(String j:i) {
                System.out.print(j);
                if(counter>z) {
                    System.out.print(" ");
                    z++;
                }
            }
            System.out.println();
        }

        /**
        String[] arr = str.split(" ");
        String[][] matrix = new String[counter][arr.length/counter];
        for (int i = 0 ; i < counter; i++) {
            for (int j = 0 ; j < (arr.length/counter); j++) {
                matrix[i][j] = arr[k];
                k++;
            }
        }
        String[][] matrix2 = new String[arr.length/counter][counter];
        for (int x = 0; x < counter ; x++) {
            for (int y = (arr.length/counter)-1; y >= 0; y--) {
                matrix2[y][x] = arr[9-k];
                k--;
            }
        }
        for (int m = 0; m < (arr.length/counter); m++) {
            for (int n = 0; n < counter; n++) {
                if (n == (counter-1))
                    System.out.print(matrix2[m][n]);
                else
                    System.out.print(matrix2[m][n] + " ");
            }
            System.out.println();
        }

        */
    }
}

/**
 * На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
 * Поверните матрицу на 90 градусов против часовой стрелки.
 *
 * Sample Input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sample Output:
 * 3 6 9
 * 2 5 8
 * 1 4 7
 */