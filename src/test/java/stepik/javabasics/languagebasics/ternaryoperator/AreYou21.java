package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class AreYou21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        System.out.println(age > 20 ? "Да" : "Нет");
    }
}

/*
Вася приехал в Америку и он оооооочень любит кофе.
В Америке приобрести этот напиток можно лишь лицам достигшим возраста 21 год.
Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе?

Sample Input 1:
18
Sample Output 1:
Нет
Sample Input 2:
34
Sample Output 2:
Да
 */