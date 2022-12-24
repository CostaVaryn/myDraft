package books.leonardtasks.chapter2;

import java.util.Objects;

public class Player {
    private int id;
    private String name;
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Player p1 = new Player(1, "Рафаэль Надаль");
        Player p2 = new Player(1, "Рафаэль Надаль");
        System.out.println(p1.equals(p2)); // false
        System.out.println("хеш-код p1: " + p1.hashCode()); // 1627674070
        System.out.println("хеш-код p2: " + p2.hashCode()); // 1360875712
    }
}
