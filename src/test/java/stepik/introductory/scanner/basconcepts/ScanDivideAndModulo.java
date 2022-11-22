package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanDivideAndModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt(), salary = sc.nextInt();
        sc.close();
        int maxPeople = budget / salary;
        int restBalance = budget % salary;
        System.out.println(maxPeople + " " + restBalance);
    }
}
