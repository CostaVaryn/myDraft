package stepik.javacore.libraryjava;

import java.util.*;

public class ArrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while(sc.hasNext()) {
            String str = sc.next();
            list.add(str);
        }
        Collections.sort(list);
        for(String s : list) {
            System.out.print(s + " ");
        }

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arrStr = str.split(" ");
        Arrays.sort(arrStr);
        for(String s : arrStr) {
            System.out.print(s + " ");
        }
         */

    }
}
