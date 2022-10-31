package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

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
}

class Library extends Building {
    boolean hasAWebsite;
    public Library(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean hasAWebsite) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.hasAWebsite = hasAWebsite;
    }
    public void startEvent(String event) {
        System.out.println("Сегодня: " + event);
    }
}

class House extends Building {
    boolean isPrivate;
    public House(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isPrivate) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isPrivate = isPrivate;
    }
}

class PoliceDepartment extends Building {
    boolean isFBI;
    public PoliceDepartment(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isFBI) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isFBI = isFBI;
    }
}

class University extends Building {
    boolean isAcademy;
    public University(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isAcademy) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isAcademy = isAcademy;
    }
}

class ShoppingCenter extends Building {
    boolean isCountry;
    public ShoppingCenter(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isCountry) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isCountry = isCountry;
    }
}

class HighRiseBuilding extends Building {
    boolean isMemorial;
    public HighRiseBuilding(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument, boolean isMemorial) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
        this.isMemorial = isMemorial;
    }
}