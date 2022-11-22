package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
        sc.close();
        System.out.println((x + y + z) / 3);
    }
}
