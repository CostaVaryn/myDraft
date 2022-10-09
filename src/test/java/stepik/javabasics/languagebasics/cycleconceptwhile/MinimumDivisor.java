package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class MinimumDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 2;
        sc.close();
        while (a >= 2) {
            if(a%x==0){
                System.out.println(x);
                break;
            }
            else {
                x++;
            }
        }
    }
}

/*
Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

Sample Input:
15
Sample Output:
3
 */