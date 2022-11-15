package stepik.adaptivecourse;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            sum += a;
            count++;
            if(a == 0) {
                break;
            }
        }
        System.out.println(sum/(count-1));
    }
}

/**
 * Среднее значение
 * Дана последовательность целых чисел, заканчивающаяся цифрой 0.
 * Найдите среднее значение всех элементов этой последовательности.
 * Само число 0 не входит в последовательность и служит лишь знаком прекращения.
 *
 * Пример ввода:
 * 1
 * 7
 * 9
 * 0
 * Пример вывода:
 * 5.66666666667
 */