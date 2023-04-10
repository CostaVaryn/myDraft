package tg.cd22.nov;

import java.util.UUID;

public class RanStrGen {
    public static void main(String[] args) {
        String randomStr = usingRandomUUID();
        System.out.println("Случайная строка из 32 символов: " + randomStr);
        // System.out.println(randomStr.length());
    }

    static String usingRandomUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("_", "").replaceAll("-", "");
    }
}
