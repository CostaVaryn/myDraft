package stepik.javabasics.languagebasics.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            arrayList.add(0);
        }
        arrayList.add(1);
        for (Integer nums : arrayList) {
            System.out.print(nums + " ");
        }
    }
}

/*
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0.
Выведите список на экран через пробел.

Sample Input:
3
Sample Output:
1 0 0 0 1
 */