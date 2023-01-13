package jr;

public class MainPhone {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1878);
        AbstractPhone phone = new Phone(1927);
        AbstractPhone videoPhone = new VideoPhone(1961);
        User user = new User("Mark");
        user.callAnotherUser(2_25_17, firstPhone);

        user.callAnotherUser(2_25_17, phone);

        user.callAnotherUser(2_25_17, videoPhone);
    }
}
