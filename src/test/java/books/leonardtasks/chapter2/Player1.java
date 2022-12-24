package books.leonardtasks.chapter2;

import java.util.Objects;

public class Player1 {
    private int id;
    private String name;
    public Player1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player1 other = (Player1) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Player1 p1 = new Player1(1, "Рафаэль Надаль");
        Player1 p2 = new Player1(1, "Рафаэль Надаль");
        System.out.println(p1.equals(p2)); // true
        System.out.println("хеш-код p1: " + p1.hashCode()); // 1627674070
        System.out.println("хеш-код p2: " + p2.hashCode()); // 1360875712
    }
}
