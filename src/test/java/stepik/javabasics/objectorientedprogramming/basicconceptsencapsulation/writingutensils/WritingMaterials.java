package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.writingutensils;

class WritingMaterials {

    String name;
    String color;
    double length;
    double price;
    boolean draw;

    public WritingMaterials() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void display() {
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, ", name, color, length);
        System.out.printf("Цена: %s, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
    public void draw() {
        if (draw) {
            System.out.printf("%s провёл линию. Её цвет - %s.\n",name,color);
        } else {
            System.out.printf("%s не может ничего нарисовать.\n",name);
        }
    }
    public void replace_rod(String str) {
        this.color = str;
    }
    public void priceDown(double n) {
        price -= n;
    }
    public void priceUp(double n) {
        price += n;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public String isDraw() {
        return draw ? "Да" : "Нет";
    }
    /*

        ### lesson 2 ###

    String name;
    String color;
    double length;
    double price;
    boolean draw;

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, double price) {
        this.name = name;
        this.price = price;
        color = "No Color";
    }

    public WritingMaterials(double length, double price, boolean draw) {
        this.length = length;
        this.price = price;
        this.draw = draw;
        name = "No Name";
        color = "No Color";
    }

    public WritingMaterials(String name, String color, double length, double price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
    }
    public void display() {
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, ", name, color, length);
        System.out.printf("Цена: %s, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
    public void draw() {
        if (draw) {
            System.out.printf("%s провёл линию. Её цвет - %s.\n",name,color);
        } else {
            System.out.printf("%s не может ничего нарисовать.\n",name);
        }
    }
    public void replace_rod(String str) {
        this.color = str;
    }
    public double priceDown(double n) {
        return price -= n;
    }
    public double priceUp(double n) {
        return price += n;
    }

        ### lesson 1 ###

    String name;
    String color;
    double length;
    int price;
    boolean draw;
    public void display() {
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, ", name, color, length);
        System.out.printf("Цена: %d, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
    public void draw() {
        if (draw) {
            System.out.printf("%s провёл линию. Её цвет - %s.\n",name,color);
        } else {
            System.out.printf("%s не может ничего нарисовать.\n",name);
        }
    }
    public void replace_rod(String str) {
        this.color = str;
    }
    public int priceDown(int n) {
        return price -= n;
    }
    public int priceUp(int n) {
        return price += n;
    }

    public WritingMaterials() {
    }
    */
}
