package books.leonardtasks.chapter2;

import java.awt.*;
import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;
    public Car(String name, Color color) {

        this.name = Objects.requireNonNull(name,
                "Имя автомобиля не может быть null");
        this.color = Objects.requireNonNull(color,
                "Цвет автомобиля не может быть null");

 /*
        if (name == null) {
            throw new NullPointerException("Имя автомобиля не может быть null");
        }
        if (color == null) {
            throw new NullPointerException("Цвет автомобиля не может быть null");
        }
        this.name = name;
        this.color = color;
 */
    }

    public void assignDriver(String license, Point location) {

        Objects.requireNonNull(license, "Лицензия не может быть null");
        Objects.requireNonNull(location, "Местоположение не может быть null");
        /*
        if (license == null) {
            throw new NullPointerException("Лицензия не может быть null");
        }
        if (location == null) {
            throw new NullPointerException("Местоположение не может быть null");
        }
         */
    }
}

