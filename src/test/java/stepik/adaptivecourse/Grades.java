package stepik.adaptivecourse;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cD = 0, cC = 0, cB = 0, cA = 0;
        int A = 5, B = 4, C = 3, D = 2;
        int[] grad = new int[n];
        for (int i = 0; i < n; i++) {
            grad[i] = sc.nextInt();
            switch (grad[i]) {
                case 2:
                    cD += 1;
                    break;
                case 3:
                    cC += 1;
                    break;
                case 4:
                    cB += 1;
                    break;
                case 5:
                    cA += 1;
                    break;
            }
        }
        sc.close();
        System.out.printf("%d %d %d %d", cD, cC, cB, cA);
    }
}

/*
Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in the class consisting of n students.
The program gets number n as input, and then gets the grades themselves (one by one).
The program should output four numbers in a single line - the number of "D", the number of "C",
the number of "B" and the number of "A" grades.
 */