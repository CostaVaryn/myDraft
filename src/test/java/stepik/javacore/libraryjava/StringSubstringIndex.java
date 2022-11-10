package stepik.javacore.libraryjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSubstringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String findStr = sc.next();
        sc.close();
        int lastIndex = 0;
        List<Integer> result = new ArrayList<Integer>();
        while(lastIndex != -1) {
            lastIndex = str.indexOf(findStr,lastIndex);
            if(lastIndex != -1){
                result.add(lastIndex + 1);
                lastIndex += 1;
            }
        }
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            result.forEach(System.out::println);
        }

        //System.out.println(Arrays.toString(result.toArray()));
    }
}
