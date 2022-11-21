package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrFiveNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        sc.close();
        String[] dataHeight = nums.split(",");
        for (String el: dataHeight) {
            System.out.println(el);
        }
    }
}

/**
 * На вход подаётся строка из элементов, разделённых запятой.
 * Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
 *
 * Sample Input:
 * 1,2,3,4,5
 * Sample Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 */
