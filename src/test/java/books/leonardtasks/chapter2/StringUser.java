package books.leonardtasks.chapter2;

import java.lang.reflect.Field;

public class StringUser {
    public static void main(String[] args) throws Exception {
        String user = "guest";
        System.out.println("Тип пользователя: " + user);
        Class<String> type = String.class;
        Field field = type.getDeclaredField("value");
        field.setAccessible(true);
        char[] chars = (char[]) field.get(user);
        chars[0] = 'a';
        chars[1] = 'd';
        chars[2] = 'm';
        chars[3] = 'i';
        chars[4] = 'n';
    }
}
