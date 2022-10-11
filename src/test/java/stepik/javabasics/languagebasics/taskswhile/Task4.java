package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
        sc.close();
        if ((1 <= k && k <= 10) && (0 <= n && n <= 100)) {
            while (count <= n) {
                if (count % k == 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}

/*
водятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100).
Выведите на экран построчно все числа кратные k от 1 до n включительно.

Sample Input 1:
4
27
Sample Output 1:
4
8
12
16
20
24
Sample Input 2:
7
17
Sample Output 2:
7
14
 */