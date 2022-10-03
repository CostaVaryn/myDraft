package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int aa = a%10, bb = b%10, cc = c%10;
        System.out.println((aa+bb+cc)+ "vll");
    }
}

/*
Робот ВАЛЛ-И каждый день меняет пароль от своей учетной записи на обучающей платформе.
Ему нравится придумывать числа разной длины и суммировать их последние цифры.
К получившемуся значению он добавляет строчные согласные буквы, входящие в его имя на латинице.
Составьте программу для ВАЛЛ-И, которая позволяла бы ему придумывать 3 любых целых числа и выдавала бы пароль на текущий день.

Входные данные:
3 натуральных числа

Выходные данные:
выведите ответ на задачу

(если в результате вычислений получается однозначное число, то добавлять 0 в начале не нужно)

Sample Input 1:
123
204
15689
Sample Output 1:
16vll

Sample Input 2:
1723
13413477
1205
Sample Output 2:
15vll
 */