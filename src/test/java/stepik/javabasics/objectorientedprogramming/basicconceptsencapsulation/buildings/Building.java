package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

abstract class Building {
    String title;
    String address;
    int yearOfConstruction;
    String architectName;
    boolean isCulturalMonument;

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String getArchitectName() {
        return architectName;
    }

    public Building(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        this.title = title;
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
        this.architectName = architectName;
        this.isCulturalMonument = isCulturalMonument;
    }
    public abstract void startEvent();
}

class Library extends Building {
    boolean hasAWebsite;
    public Library(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean hasAWebsite) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.hasAWebsite = hasAWebsite;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("Литературный праздник");
    }
}

class House extends Building {
    boolean isPrivate;
    public House(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isPrivate) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isPrivate = isPrivate;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("У кого день рождения?");
    }
}

class PoliceDepartment extends Building {
    boolean isFBI;
    public PoliceDepartment(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isFBI) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isFBI = isFBI;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("День полиции?");
    }
}

class University extends Building {
    boolean isAcademy;
    public University(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isAcademy) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isAcademy = isAcademy;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("День рождения ректора!");
    }
}

class ShoppingCenter extends Building {
    boolean isCountry;
    public ShoppingCenter(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isCountry) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isCountry = isCountry;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("Распродажи!!!");
    }
}

class HighRiseBuilding extends Building {
    boolean isMemorial;
    public HighRiseBuilding(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isMemorial) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isMemorial = isMemorial;
    }
    public void startEvent() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
        System.out.println("Что за праздник?");
    }
}