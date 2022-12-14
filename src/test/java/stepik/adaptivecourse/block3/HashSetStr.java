package stepik.adaptivecourse.block3;

import java.util.*;

public class HashSetStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
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

/*
Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
The order of elements in the result list may be any (elements will be sorted by the testing system).

If the input list doesn't contain any strings then the result list should be empty.
Hints: it is possible to use sets, maps, lists and so on for helping.
Solution format. Submit your lambda expression in any valid format with ; on the end.
Examples: x -> x; (x) -> { return x; };

Sample Input 1:
java scala java clojure clojure
Sample Output 1:
clojure java scala

Sample Input 2:
the three the three the three an an a
Sample Output 2:
a an the three
 */