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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        String[] read = reader.toString().split(" ");
        for (String s : read) {
            if (s.matches("^[J].*")) {
                list.add(s);
            }
        }
        System.out.println(list);

        //Stream stream = list.stream();
    }
}

/*
Given string as "JButton Button JMenu..." to stdin of your programm

Add all elements from this string to List<String>
Next, using Stream API remove all items not starting with J and items beginning with J
replace with the same elements but without the J ,for example JFrame -> Frame
next, print all the remaining elements in reverse order(using .println())
*in the lesson ListIterator. set() it was necessary to perform the same logic,
but using ListIterator. You can compare these 2 solutions

Sample Input:
ImageButton JTextField JTextArea CheckBox JMenu

Sample Output:
Menu
TextArea
TextField
 */