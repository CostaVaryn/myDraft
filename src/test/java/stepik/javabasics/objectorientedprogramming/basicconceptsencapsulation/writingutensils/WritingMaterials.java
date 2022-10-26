package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.writingutensils;

class WritingMaterials {

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
}
