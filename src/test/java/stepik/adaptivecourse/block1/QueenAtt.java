package stepik.adaptivecourse.block1;

import java.util.Scanner;

public class QueenAtt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
        if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) || ((x1 == x2) || (y1 == y2))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
You are given coordinates of two queens on a chess board. Find out, whether they hit each other or not.

INPUT
Four integer numbers x1, y1, x2, y2x are being typed.

OUTPUT
Type "YES" (uppercase) if they hit each other or "NO" if the don't.
 */