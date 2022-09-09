package stepik.introductory.scanner;

import java.util.Scanner;

public class ScanDivideAndModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt(), salary = sc.nextInt();
        int maxPeople = budget / salary;
        int restBalance = budget % salary;
        System.out.println(maxPeople + " " + restBalance);
    }
}
