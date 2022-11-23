package stepik.introductory.scanner.cycles.justwhile;

import java.util.Scanner;

public class WhileRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0, sum = 0, x = 0;
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            if (a >= 0) {
                x = a;
                count++;
                sum += x;
            }
            if (x > 10) {
                break;
            }
        }
        sc.close();
        double res = ((sum - x) / (count - 1));
        System.out.println(res);
    }
}
