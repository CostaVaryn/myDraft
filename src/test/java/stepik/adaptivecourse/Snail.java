package stepik.adaptivecourse;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        int h = 20;
        int a = 7;
        int b = 3;
        int start = 0, day = 0;
        //sc.close();
        for (int i = 1; start <= h; i++) {
            start += a;
            if (start >= h) {
                day = i;
                break;
            }
            start -= b;
        }
        System.out.println(day);
    }
}

/*
Snail

Snail creeps up the vertical pole of height H feets.
Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B.
Every integer does not exceed 100.

Sample Input 1:
10
3
2
Sample Output 1:
8

Sample Input 2:
20
7
3
Sample Output 2:
5
 */