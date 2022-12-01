package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class Replacement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] receipt = new String[n];
        int count = 0;

        while (count < n) {
            receipt[count] = sc.nextLine();
            count++;
        }

        int m = sc.nextInt();
        sc.nextLine();
        int count1 = 0;
        String[] products = new String[m];
        while (count1 < m) {
            products[count1] = sc.nextLine();
            products[count1] = (products[count1].trim().replaceAll(" - ", " "));
            count1++;
        }
        sc.close();

        for (int i = 0; i < products.length; i++) {
            String[] s = products[i].split(" ");
            for (int j = 0; j < receipt.length; j++) {
                String s1 = s[0].substring(0, 1).toLowerCase() + s[0].substring(1);
                String s2 = s[1].substring(0, 1).toLowerCase() + s[1].substring(1);
                receipt[j] = receipt[j].replaceAll(s1,s2);
            }
            for (int j = 0; j < receipt.length; j++) {
                String s1 = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
                String s2 = s[1].substring(0, 1).toUpperCase() + s[1].substring(1);
                receipt[j] = receipt[j].replaceAll(s1,s2);
            }
        }
        for (String s : receipt) {
            System.out.println(s);
        }
    }
}

/*
Вася из задачи на слайде 9 решил улучшить алгоритм.
Что если у человека есть аллергия не на один, а на несколько продуктов?
Да и держать книгу как одну большую строку не очень удобно.
Помимо всего прочего, непривычно видеть текст без заглавных букв.
Помогите Васе улучшить алгоритм.

Входные данные
На первой строке записывается натуральное число n - количество строчек в книге.
Затем вводится n строк - строки книги.
Потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт,
на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами.
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
На окончания не обращайте внимание.
ВАЖНО!!!
Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко

Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */