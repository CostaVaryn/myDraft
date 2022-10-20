package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class MaxSwapMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextDouble();
        }
        double tempMax = arr[0];
        double tempMin = arr[0];
        int valueMax = 0;
        int valueMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
                valueMin = i;
            }
            if (arr[i] > tempMax) {
                tempMax = arr[i];
                valueMax = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == valueMin) {
                arr[i] = tempMax;
            } else if (i == valueMax) {
                arr[i] = tempMin;
            }
        }
        for (double k: arr) {
            System.out.print( k + " ");
        }
    }
}

/*
С клавиатуры вводится число n (n >= 2) за ним вводится n действительных чисел.
Ваша задача - поменять местами максимальный и минимальный элементы.
После чего выведите на экран массив через пробел.
Гарантируется, что максимальный и минимальный элементы содержатся в единственном экземпляре.

Sample Input:
6
0.5 6.0 -7.0 3.0 -2.67 12.0
Sample Output:
0.5 6.0 12.0 3.0 -2.67 -7.0
 */