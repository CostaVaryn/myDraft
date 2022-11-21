package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrNumsBigAndSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = arr[i] + sc.nextInt();
            if (i > 0 && arr[i] >= arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
        sc.close();
    }
}
