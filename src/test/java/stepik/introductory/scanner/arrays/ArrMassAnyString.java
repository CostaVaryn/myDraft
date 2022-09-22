package stepik.introductory.scanner.arrays;

import com.sun.glass.ui.Size;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrMassAnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       // int size = 5;
        sc.nextLine();

        String[][] str = new String[size][];


        do {
            for (int i = 0; i < size; ++i) {
                str[i] = sc.nextLine().split(" ");
                System.out.print(Arrays.toString(str[i]) + "\n");
            }
        } while(sc.hasNext());
        sc.close();
        //System.out.println(Arrays.toString(str[size]));

/**
        for (int i = 0; i <= size; i++) {
                str[i] = sc.nextLine().split(" ");
                    System.out.println(Arrays.deepToString(str[0]));
                //System.out.println(Arrays.deepToString(str[i]));
            //System.out.println(Arrays.toString(str[i][j]));
        }
*/
    }
}
/**
 * На ввод подаются несколько строк текста. Вначале подаётся число n - количество строк, а затем сами строки.
 * Знаки препинания удалены.
 * Образуйте многомерный массив слов из этих строк и выведите его на печать.
 * Примечание. В ходе работы вы можете столкнуться с проблемой вроде этого:
 * []
 * [Не, пей, вина, Гертруда]
 * [Быть, или, не, быть]
 * [Бедный, Йорик]
 * Это важный вопрос, связанный с особенностями работы методов ввода nextInt()  и nextLine().
 * Попробуйте самостоятельно разобраться и решить эту проблему.
 *
 * Sample Input:
 * 4
 * Не пей вина Гертруда
 * Быть или не быть
 * Бедный Йорик
 * Неладно что-то в датском королевстве
 *
 * Sample Output:
 * [Не, пей, вина, Гертруда]
 * [Быть, или, не, быть]
 * [Бедный, Йорик]
 * [Неладно, что-то, в, датском, королевстве]
 */