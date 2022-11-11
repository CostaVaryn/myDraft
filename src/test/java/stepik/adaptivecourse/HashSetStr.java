package stepik.adaptivecourse;

import java.util.*;

import static java.util.Arrays.*;

public class HashSetStr {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine();
        String str = "java scala java clojure clojure";
        String[] arStr = str.split(" ");

        List list = new ArrayList(Arrays.asList(arStr));

        Collections.sort(list);
        Set resultSet = new LinkedHashSet(list);


        //HashSet<String> hashSet = new HashSet<>(Arrays.asList(arStr));

        for(Object s : resultSet) {
            System.out.print(s + " ");
        }
    }
}
