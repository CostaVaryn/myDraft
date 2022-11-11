package stepik.javabasics.block5;

import java.util.Scanner;

public class CycleKamaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxMas = Integer.parseInt(sc.nextLine());
        sc.close();
        int minRez = Integer.MAX_VALUE;
        String[] arrStr = str.split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
            minRez = arrInt[0];
        }
        for (int j = 0; j < arrInt.length; j++) {
            if (minRez > arrInt[j]) {
                minRez = arrInt[j];
            }
        }
        if (maxMas < minRez) {
            System.out.println(minRez - maxMas);
        } else {
            System.out.println(-1);
        }
    }
}

/*
Известно, что камаз надо отправить по дороге, на которой содержится несколько мостов.
Для каждого моста известно его ограничение по грузоподъёмности машины
(если такое ограничение равно t, то по мосту может проехать машина, суммарной массой не больше, чем t кг).
Известно, что масса самого камаза равна x кг.
Найдите, какое максимальное количество песка в кг можно насыпать в камаз.
Если это сделать невозможно, от выведите -1.
Обратите внимание, что камаз не будут отправлять пустым, в таком случае тоже надо вывести -1.

На первой строке через пробел введены целые числа - ограничения мостов по массе.
На второй строке введена масса камаза. Все значения указаны в килограммах.

Выведите одно число - ответ на задачу.

Sample Input:
5000 8000 12000 4500 6000 7000 6000 10000
3000

Sample Output:
1500
 */