package stepik.adaptivecourse.block3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QueuesDeques {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.addLast(5);
        queue.pollFirst();
        queue.pollFirst();
        System.out.println(queue);
    }
}
