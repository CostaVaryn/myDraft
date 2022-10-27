package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.*;

public class SortByStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sortByLength(s);
    }
    static void sortByLength(String str) {
        String[] strs = str.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        Arrays.sort(strs);
        Collections.sort(list);
        list.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(String.join(" ", list));
    }
}

/*
Напишите функцию sortByLength,  которая принимает как аргумент строку и сортирует её по длине слова.
Если длины слов одинаковы, то сортировать в алфавитном порядке. Содержание функции main менять запрещено.

Sample Input:
cad aba q we qwert
Sample Output:
q we aba cad qwert
 */