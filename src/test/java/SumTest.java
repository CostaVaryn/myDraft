import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] items = reader.readLine().split(" ");
            int a = Integer.parseInt(items[0]);
            int b = Integer.parseInt(items[1]);
            System.out.println(a + b);
        }
    }
}