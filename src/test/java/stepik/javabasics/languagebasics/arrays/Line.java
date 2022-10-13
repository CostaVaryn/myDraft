package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int posPetya = 1;
        int heiPetya = sc.nextInt();
        sc.close();

        for (int j = 0; j < n; j++) {
            if (arr[j] >= heiPetya) {
                posPetya++;
            } else if (arr[j] < heiPetya) {
                break;
            }
        }
        System.out.println(posPetya);
    }
}

/*
Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю.
Помогите ему это сделать.

Входные данные
Программа получает на вход невозрастающую последовательность натуральных чисел
(сначала вводится количество, затем сами числа), означающих рост каждого человека в строю.
После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.

Выходные данные
Выведите номер, под которым Петя должен встать в строй.
Если в строю есть люди с одинаковым ростом, таким же, как у Пети, то он должен встать после них.

Sample Input:
7
165
163
160
160
157
157
155
162
Sample Output:
3
 */