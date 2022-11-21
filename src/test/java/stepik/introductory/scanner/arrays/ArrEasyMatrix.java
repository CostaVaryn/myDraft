package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrEasyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while(sc.hasNext()){
            String[] Arr = sc.nextLine().split(" ");
            b = Arr.length;
            a++;
        }
        sc.close();
        System.out.println("Строк: " + a);
        System.out.print("Столбцов: " + b);
    }
}
