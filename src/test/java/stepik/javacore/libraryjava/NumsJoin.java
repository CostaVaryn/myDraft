package stepik.javacore.libraryjava;

import java.util.*;

public class NumsJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }

        List list = new ArrayList((map.entrySet()));
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Object o : list) {
            String str = o.toString();
            System.out.println(str.replace('=', ' '));
            System.out.println(o);
        }
    }
}

/*
На вход поступает N >= 1. Затем идет N целых чисел.
Вывести количество вхождений каждого числа в отсортированном по числу порядке.
На каждой строчке сначала выводить число, затем количество его вхождений.

Sample Input:
8
1 2 2 4 8 8 3 8

Sample Output:
1 1
2 2
3 1
4 1
8 3
 */