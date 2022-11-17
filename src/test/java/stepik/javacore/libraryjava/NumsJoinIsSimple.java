package stepik.javacore.libraryjava;

import java.util.*;
import java.util.stream.Collectors;

public class NumsJoinIsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        List asList = Arrays.asList(nums);
        Set<Integer> mySet = new HashSet<Integer>(asList);
        for(Integer s: mySet){
            System.out.println(s + " " + Collections.frequency(asList,s));
        }

        /*
        Arrays.stream(nums)
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));
         */

    }
}
