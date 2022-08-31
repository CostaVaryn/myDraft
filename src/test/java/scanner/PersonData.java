package scanner;

import java.util.Scanner;

public class PersonData {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height (m): ");
        float height = in.nextFloat();
        System.out.print("Input weight (kg): ");
        float weight = in.nextFloat();
        System.out.printf("Name: %s   Age: %d   Height: %.2f m   Weight: %.2f kg\n", name, age, height, weight);
        in.close();
    }
}
