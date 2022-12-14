package stepik.javacore.libraryjava;

import java.util.Scanner;

public class GradeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        double val = s.replaceAll("[^ABCDEF]", "").length();
        double a = s.replaceAll("[^A]", "").length();
        System.out.println(a / val);
    }
}

/*
Write a program which finds the percentage of students who have received the A grade.
Used the five-point grading scale with grades A, B, C, D and F.

Input format:
A single line with student grades separated by a space. There is at least one grade.

Output format:
The floating point number.

Sample Input 1:
F B A A B C A D
Sample Output 1:
0.375

Sample Input 2:
B C B
Sample Output 2:
0.0

Sample Input 3:
A D
Sample Output 3:
0.5
 */