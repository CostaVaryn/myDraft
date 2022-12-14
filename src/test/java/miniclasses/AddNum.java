package miniclasses;

import java.io.*;
import java.util.Date;

/**
 * <h1> Сложите два числа!</h1>
 * Программа miniclasses.AddNum реализует приложение, которое
 * просто складывает два заданных целых числа и выводит
 * результат на экран.
 * <p>
 * <b>Примечание:</b> Правильные комментарии в вашей программе
 * удобной для пользователя и предполагается, что этот код является
 * более высококачественным.
 *
 * @автор  Constantin
 * @версия 1.0
 * @дата   2022-08-29
 */

public class AddNum {
    
    /**
     * Этот метод используется для сложения двух целых чисел. Это
     * простейшая форма метода класса, просто чтобы
     * показать использование различных тегов javadoc.
     * @param numA Это первый параметр метода addNum
     * @param numB Это второй параметр метода addNum
     * @return int Это возвращает сумму numA и numB.
     */
    
    public int addNum(int numA, int numB) {
        return numA + numB;
    }

    /**
     * Это основной метод, использующий метод addNum.
     * @param args Не используется.
     * @return Ничего.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */

    public static void main(String args[]) throws IOException {

        System.out.format("Сегодня %tc\n\n",new Date());

        for(int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                System.out.format("%d\t",  i * j);
            }
            System.out.print('\n');
        }
        System.out.println();

        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);
        System.out.println("Суммой 10 и 20 является: " + sum);

        int number = 3; // Возводимое в степень число
        int result = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while(true) {
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
            if (power > 10)
                break; // выход из цикла
        }
        System.out.println();

        // Выводим значения второго множителя в строке
        System.out.println("    2  3  4  5  6  7  8  9");
        int i = 2;      // первый множитель, присваиваем стартовое значение
        while(i < 10) {   // Первый цикл, выполняем пока первый множитель меньше 10
            System.out.print(i + " | ");// Выводим первый множитель в начало строки
            int j = 2;                  // второй множитель, стартовое значение
            while (j < 10) { // Второй цикл, выполняем пока второй множитель меньше 10
                int mul = i * j; // Считаем произведение множителей
                if (mul < 10) {// Если содержит одну цифру-после него выводим два пробела
                    System.out.print(mul + "  ");
                }
                else {  // иначе выводим произведение и после него - один пробел
                    System.out.print(mul + " ");
                }
                j++;     // Увеличиваем на единицу второй множитель,
            }            // Переходим к началу второго цикла (while (j < 10 ).... )
            System.out.println(); // Перейдем на следующую строку вывода
            i++;                  // Увеличиваем на единицу первый множитель,
        } // Перейдем к началу первого цикла (while (i < 10))
    }
}
