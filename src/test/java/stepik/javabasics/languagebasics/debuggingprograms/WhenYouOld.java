package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class WhenYouOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if ((n * 2 < m) && (n * 2 != m)) {
            for (int i = 2020; i < 10000; i++){
                n++;
                m++;
                if(n * 2 == m){
                    System.out.print(i+1);
                    break;
                }
            }
        } else if (n * 2 == m) {
            System.out.print("2020");
        } else {
            System.out.print("Никогда");
        }
    }
}

/*
У старшего брата маленького Лёши день рождения в тот же день, что и у него.
Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год.
Необходимо определить, в каком году Брат Лёши будет ровно вдвое старше?
Если такое невозможно, то выведите в консоль слово "Никогда".

Входные данные:
два целых числа n и k (k > n)

Выходные данные:
ответ на задачу

Sample Input 1:
4
9
Sample Output 1:
2021

Sample Input 2:
6
7
Sample Output 2:
Никогда
 */