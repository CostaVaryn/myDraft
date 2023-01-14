package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class SumNaturalNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        sc.close();
        int val = nums.length();
        int count = 0;
        int sum = 0;
        String[] arr = nums.split("");
        while (count < val) {
            sum += Integer.parseInt(arr[count]);
            count++;
        }
        System.out.println(sum);
    }
}

/*
Дано натуральное число N. Напишите программу, вычисляющую сумму цифр числа N.

Sample Input:
1234
Sample Output:
10
 */