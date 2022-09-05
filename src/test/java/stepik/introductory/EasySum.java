package stepik.introductory;

import java.util.Scanner;

public class EasySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int sum = x + y;
        System.out.print(sum);
    }
}
