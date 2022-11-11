package stepik.adaptivecourse.block1;

import java.util.Scanner;

public class Malevia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String que = sc.nextLine();
        switch (que) {
            case "rectangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(a*b);
                break;
            case "circle":
                double r = sc.nextDouble();
                System.out.println((r*r)*3.14);
                break;
            case "triangle":
                double A = sc.nextDouble();
                double B = sc.nextDouble();
                double C = sc.nextDouble();
                double p = ((A+B+C)/2);
                System.out.println(Math.sqrt(p*(p-A)*(p-B)*(p-C)));
                break;
            default:
                break;
        }
    }
}

/*
Residents of the Malevia country often experiment with the plan of their rooms.
Rooms can be triangular, rectangular and round.
To quickly calculate the floorage it is required to write a program,
which gets the type of the room shape and the relevant parameters as
input - the program should output the area of the resulting room.

The value of 3.14 is used instead of the number π in Malevia.

Input format used by the Malevians:

Sample Input 1:
rectangle
4
10
Sample Output 1:
40.0

Sample Input 2:
circle
5
Sample Output 2:
78.5

Sample Input 3:
triangle
3
4
5
Sample Output 3:
6.0
 */