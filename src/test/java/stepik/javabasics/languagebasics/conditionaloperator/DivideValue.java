package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class DivideValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        if (b == 0) {
            System.out.println("Error");
        } else {
            System.out.println(a / b);
        }
    }
}
