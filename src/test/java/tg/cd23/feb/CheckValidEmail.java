package tg.cd23.feb;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidEmail {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("name@gmail.com");
        emails.add("@gail.om");
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for (String mail : emails) {
            Matcher matcher = pattern.matcher(mail);
            System.out.println(mail + " : " + matcher.matches());
        }
    }
}
