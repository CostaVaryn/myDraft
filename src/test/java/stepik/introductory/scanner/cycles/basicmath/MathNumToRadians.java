package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathNumToRadians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        System.out.println(Math.toRadians(x));
    }
}
