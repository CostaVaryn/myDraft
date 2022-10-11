package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int count = 1;
        while (count <= a) {
            System.out.println(count);
            count++;
        }
    }
}

/*
Вводится число натуральное число n. Выведите на экран построчно все числа от 1 до n.

Sample Input 1:
5
Sample Output 1:
1
2
3
4
5
Sample Input 2:
2
Sample Output 2:
1
2
 */