package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List listA = new ArrayList();
        while (a != 0) {
            listA.add(a);
            a = sc.nextInt();
        }
        Collections.sort(listA);
        System.out.println(listA.get(listA.size() - 1));
    }
}

/*
Последовательность состоит из различных натуральных чисел и завершается числом 0.
Определите значение максимального элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
Гарантируется, что будет введено хотя бы 2 числа.

Выходные данные
Выведите ответ на задачу.

Sample Input:
2 3 4 5 8 7 4 0
Sample Output:
8
 */