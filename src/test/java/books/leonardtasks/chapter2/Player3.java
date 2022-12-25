package books.leonardtasks.chapter2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player3 {
    private int id;
    private String name;
    public Player3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    public static void main(String[] args) {
        Player3 p1 = new Player3(1, "Рафаэль Надаль");
        Player3 p2 = new Player3(1, "Рафаэль Надаль");
        Set<Player3> players = new HashSet<>();
        players.add(p1);
        players.add(p2);
        System.out.println ("хеш-код p1: " + p1.hashCode()); // -561403020
        System.out.println("хеш-код p2: " + p2.hashCode()); // -561403020
        System.out.println("Размер множества: " + players.size()); // 2
        System.out.println("Множество содержит Рафаэля Надаля: "
                + players.contains(new Player3(1, "Рафаэль Надаль"))); // false
        System.out.println(Objects.deepEquals(p1, p2)); // false
    }
}
