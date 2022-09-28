import java.math.BigInteger;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            // Диапазон значений от -2^31 до 2^31
            System.out.println("Спасибо! Вы ввели 32-х битное значение " + number);
        }

        if (scanner.hasNextBigInteger()) {
            BigInteger bigNumber = scanner.nextBigInteger();
            // Аналог целочисленных значений произвольной длины, у которого нет ограничения в 64 битов
            System.out.println("Ух ты! Вы ввели большое значение " + bigNumber);
        }

        if (scanner.hasNextLong()) {
            long longValue = scanner.nextLong();
            // Диапазон значений от -2^63 до 2^63
            System.out.println("Вау! Вы ввели 64-х битное значение " + longValue);
        }

        if (scanner.hasNextByte()) {
            byte byteValue = scanner.nextByte();
            // Диапазон значений от -128 до 127
            System.out.println("Вы ввели 8-ми битное значение " + byteValue);
        }

        if (scanner.hasNextFloat()) {
            float floatValue = scanner.nextFloat();
            System.out.println("Вы ввели 32-х битное число с плавающей точкой " + floatValue);
        }

        if (scanner.hasNextDouble()) {
            double doubleValue = scanner.nextDouble();
            System.out.println("Вы ввели 64-х битное число с плавающей точкой " + doubleValue);
        }

        if (scanner.hasNextShort()) {
            short shortValue = scanner.nextShort();
            // Диапазон значений от -32768 до 32767
            System.out.println("Вы ввели 16-ти битное значение " + shortValue);
        }
        if (scanner.hasNextDouble()) {
            double doubleValue = scanner.nextDouble();
            System.out.println("Вы ввели 64-х битное число с плавающей точкой " + doubleValue);
        }
        if (scanner.hasNextBoolean()) {
            boolean booleanValue = scanner.nextBoolean();
            System.out.println("Вы использовали значение типа \"истина/ложь\" " + booleanValue);
        }
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");

        }
    }
}