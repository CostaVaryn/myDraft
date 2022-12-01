package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] line = nums.split("");
        sc.close();
        int[] arr = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        System.out.println(arr[0]+arr[1]+arr[2]);
    }
}

/*
Дано трехзначное число. Найдите сумму его цифр.

Sample Input 1:
179
Sample Output 1:
17
Sample Input 2:
300
Sample Output 2:
3
 */