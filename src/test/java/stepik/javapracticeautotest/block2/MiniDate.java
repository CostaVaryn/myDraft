package stepik.javapracticeautotest.block2;

import java.util.Scanner;

public class MiniDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s > 0 && s < 86400) {
            int sec = s % 60;
            int min = (s / 60) % 60;
            int hours = s / 3600;
            String strSec = (sec < 10) ? "0" + sec : Integer.toString(sec);
            String strMin = (min < 10) ? "0" + min : Integer.toString(min);
            String strHours = (hours < 10) ? "" + hours : Integer.toString(hours);
            System.out.println(strHours + ":" + strMin + ":" + strSec);
        }
    }
}

/*
Напишите программу, которая получает на вход с клавиатуры целое число.
Это число представляет собой текущее суточное время как количество прошедших с полуночи секунд.
Затем программа должна напечатать вывод экрана электронных часов для этого времени.

Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out
Гарантируется, что входное значение — неотрицательное.
Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).
Попробуйте решить задачу без использования if и циклов, даже если вы с ними уже знакомы.

Sample Input:
60

Sample Output:
0:01:00
 */