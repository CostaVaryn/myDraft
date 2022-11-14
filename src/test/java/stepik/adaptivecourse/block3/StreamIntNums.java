package stepik.adaptivecourse.block3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntNums {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(a -> a > 0).count();
        System.out.println(count);


    }
}

