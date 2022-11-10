package stepik.javabasics.block5;

import java.util.Scanner;

public class ConditionalKamaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xMasKamaz = sc.nextInt(); // 7000
        int yMasGruz = sc.nextInt(); // 3951
        int maxMas = 15600;
        int sumMas = xMasKamaz + yMasGruz;
        if (sumMas > maxMas) {
            System.out.println("Превышена максимальная грузоподъёмность!");
        } else if ((sumMas < maxMas) && (sumMas > 12000)) {
            System.out.println("Мост рухнет!");
        } else {
            System.out.println("Ура доехали!");
        }
    }
}
