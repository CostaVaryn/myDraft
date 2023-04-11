package url.yt.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static url.yt.interview.FizzBuzz.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }


    @Test
    public void multipleOfFive() {
        assertArrayEquals(FIZZ.getBytes(), fizzBuzz.fbtest(3));
    }

    @Test
    public void multipleOfTree() {
        assertArrayEquals(BUZZ.getBytes(), fizzBuzz.fbtest(5));
    }

    @Test
    public void multipleOfFiveAndTree() {
        assertArrayEquals(FB.getBytes(), fizzBuzz.fbtest(15));
    }

    @Test
    public void notMultipleOfFiveOrTree() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                fizzBuzz.fbtest(1));
        assertTrue(exception.getMessage().contains("Big trouble"));
    }
}
