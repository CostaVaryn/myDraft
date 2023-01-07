package books.leonardtasks.chapter5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MutableMelon {
    private String type;
    private int weight;

    public MutableMelon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    private static final MutableMelon melon1 = new MutableMelon("Crenshaw", 2000);
    private static final MutableMelon melon2 = new MutableMelon("Gac", 1200);

    private final List<MutableMelon> list
            = Collections.unmodifiableList(Arrays.asList(melon1, melon2));

    public static void main(String[] args) {
        melon1.setWeight(1000);
        melon2.setWeight(500);
    }
}