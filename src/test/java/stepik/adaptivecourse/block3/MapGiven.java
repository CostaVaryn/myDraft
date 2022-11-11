package stepik.adaptivecourse.block3;

import java.util.Map;
import java.util.TreeMap;

public class MapGiven {
    public static void main(String[] args) {


        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry);

        }

    }
}

/*
The map is given.
Output each its key-value pair in the loop with a new line.
Each line must be in form of key=value (for example, Gamma=3)

Sample Input:
Sample Output:
Alpha=1
Gamma=3
Omega=24
 */