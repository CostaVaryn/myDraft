package books.leonardtasks.chapter2;

import com.sun.istack.internal.NotNull;

import java.util.Date;

public final class User {
    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    private User(UserBuilder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.created = builder.created;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
    }
    public static UserBuilder getBuilder(
            String nickname, String password) {
        return new User.UserBuilder(nickname, password);
    }

    public static final class UserBuilder {
        private final String nickname;
        private final String password;
        private final Date created;
        private String email;
        private String firstname;
        private String lastname;



        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder firstName(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastName(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
    public String getNickname() {
        return nickname;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstname () {
        return firstname;
    }
    public String getLastname () {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public Date getCreated () {
        return new Date(created.getTime());

    }
    public static void main(String[] args) {
        User user1 = getBuilder("j0r1k", "984asd98q")
            .build();

        User user2 = getBuilder("p1nkba11", "a6dd8qd4")
            .email("p1nkba11@gmail.com")
            .build ();

        User user3 = getBuilder("v1ct0r", "asd1278da")
            .email("v1ct0r@gmail.com")
            .firstName("Victor")
            .lastName("Cellar")
            .build();
    }
}
