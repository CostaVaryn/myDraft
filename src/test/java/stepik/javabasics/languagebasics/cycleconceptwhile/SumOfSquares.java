package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int count = 1;
        int sum = 0;
        while (count <= a) {
            sum += Math.pow(count, 2);
            count++;
        }
        System.out.println((Integer) sum);
    }
}

/*
По данному натуральному n вычислите сумму 1^2+2^2+...+n^2.

Sample Input:
3
Sample Output:
14
 */