public class TestLength {

    public static void main(String args[]) {

        String Str1 = new String("Добро пожаловать!");
        String Str2 = new String("Человек" );

        System.out.print("Длина строки \"Добро пожаловать!\" - " );
        System.out.println(Str1.length());

        System.out.print("Длина строки \"Человек\" - " );
        System.out.println(Str2.length());

        // Определение длины строки s1 и s2.
        String s1 = "Я стану отличным программистом!";
        int len1 = s1.length();
        String s2 = "Я стану отличным разработчиком!";
        int len2 = s2.length();

        // Вывод на экран количества символов в каждой строке.
        System.out.println( "Длина строки \"Я стану отличным программистом!\": " + len1 + " символ.");
        System.out.println( "Длина строки \"Я стану отличным разработчиком!\": " + len2 + " символ.");

        // Сравнение длин строк s1 и s2.
        if (len1 > len2) {
            System.out.println( "\nСтрока \"Я стану отличным программистом!\" длинее строки \"Я стану отличным разработчиком!\".");
        }
        if (len1 < len2) {
            System.out.println( "\nСтрока \"Я стану отличным программистом!\" короче строки \"Я стану отличным разработчиком!\".");
        }
        else {
            System.out.println( "\nСтроки \"Я стану отличным программистом!\" и \"Я стану отличным разработчиком!\" равны.");
        }
    }
}