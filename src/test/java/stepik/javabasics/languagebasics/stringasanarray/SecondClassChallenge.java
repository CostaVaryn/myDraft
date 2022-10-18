package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class SecondClassChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        sc.close();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0' || arr[i] == '6' || arr[i] == '9') {
                count++;
            }
            if (arr[i] == '8') {
                count += 2;
            }
        }
        System.out.println(count);
    }
}

/*
У второклассников очень популярна следующая задача:

101 = 1
8181515 = 4
1111112 = 0
8888888 = 14
1010101 = 3
7000007 = ?
Преподавателю программирования в некоем Центре для одаренных детей так понравилась эта задачка,
что он решил именно ее использовать для проверки знаний математики 2-го класса у своих учеников.

Пусть первое число x, а соответствующее ему n

Входные данные
Единственное неотрицательное число x, не превышающее 101001.

Выходные данные
Выведите n.

Sample Input 1:
1010101
Sample Output 1:
3

Sample Input 2:
8888888
Sample Output 2:
14
 */