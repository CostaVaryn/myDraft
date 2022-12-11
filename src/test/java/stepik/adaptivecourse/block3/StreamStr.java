package stepik.adaptivecourse.block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamStr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        String[] read = reader.toString().split(" ");
        for (String s : read) {
            if (s.matches("^[J].*")) {
                list.add(s);
            }
        }
        System.out.println(list);
        reader.close();

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