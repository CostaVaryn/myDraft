package hardtask;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Test1 {
    @Test
    public void givenStringBounded() {
        String generatedString = RandomStringUtils.random(15, true, false);
        System.out.println(generatedString);
    }

    @Test
    public void givenUsingPlainJavaRandomStringBounded() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        System.out.println(buffer.toString());
    }
}
