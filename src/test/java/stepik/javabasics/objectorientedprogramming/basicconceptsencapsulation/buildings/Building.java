package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

abstract class Building {
    String title;
    String address;
    int yearOfConstruction;
    String architectName;
    boolean isCulturalMonument;



    public Building(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        this.title = title;
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
        this.architectName = architectName;
        this.isCulturalMonument = isCulturalMonument;
    }
}

class Library extends Building {
    public Library(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}

class House extends Building {
    public House(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}

class PoliceDepartment extends Building {
    public PoliceDepartment(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}

class University extends Building {
    public University(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}

class ShoppingCenter extends Building {
    public ShoppingCenter(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}

class HighRiseBuilding extends Building {
    public HighRiseBuilding(String title, String address, int yearOfConstruction, String architectName, boolean isCulturalMonument) {
        super(title, address, yearOfConstruction, architectName, isCulturalMonument);
    }
}