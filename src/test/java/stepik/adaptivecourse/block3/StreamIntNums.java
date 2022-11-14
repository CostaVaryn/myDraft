package stepik.adaptivecourse.block3;

import java.util.stream.IntStream;

public class StreamIntNums {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(a -> a > 0).count();
        System.out.println(count);
    }
}

