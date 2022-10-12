package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class OtherNumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        sc.close();
        String sum = "";
        StringBuilder sum_plus = new StringBuilder(sum) ;
        while (true) {
            sum = String.valueOf(n % k);
            sum_plus.append(sum);
            n /= k;
            if (n == 0) {
                break;
            }
        }
        System.out.println(sum_plus.reverse());
    }
}

/*
Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.
Переведите число n из десятичной системы счисления в систему счисления с основанием k.

Sample Input:
6
2
Sample Output:
110
 */