package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class Cuba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] arr = new int[b-a+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.pow(a,3);
            a++;
        }
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i<n; i++) {
            int val = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (Math.pow(val,3) == arr[j]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            System.out.println(flag ? (int)Math.pow(val,3) : "Error");
        }
    }
}

/*
Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b.
Затем вводится число n и n чисел после него. Используя данные из массива найдите кубы этих.
Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".

Sample Input:
5
10
4
5
8
-1
5
Sample Output:
125
512
Error
125
 */