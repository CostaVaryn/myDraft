package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i =0;
        ArrayList<Integer> Mylist = new ArrayList<Integer>();
        int enter = sc.nextInt();
        while(enter!=0) {
            Mylist.add(enter);
            enter = sc.nextInt();
        }
        Collections.sort(Mylist,Collections.reverseOrder());
        System.out.println(Mylist.get(1));
    }
}

/*
Последовательность состоит из различных натуральных чисел и завершается числом 0.
Определите значение второго по величине элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
Гарантируется, что будет введено хотя бы 2 числа.

Выходные данные
Выведите ответ на задачу.

Sample Input:
2 3 4 5 8 7 4 0
Sample Output:
7
 */