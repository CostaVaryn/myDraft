package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.writingutensils;

class Pen extends WritingMaterials {

    int countColor;
    boolean auto;
    public Pen() {
        draw = true;
        countColor = 1;
    }
    public void writeMyName() {
        System.out.println("Creator");
    }
    public void setCountColor(int n) {
        countColor = n;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    @Override
    public void display() {
        System.out.println("This is Pen");
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, ", name, color, length);
        System.out.printf("Количество цветов: %d, ", countColor);
        System.out.printf("Автоматическая: %s, ", auto ? "Да" : "Нет");
        System.out.printf("Цена: %s, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
}


final class Ruler extends WritingMaterials {

    int length;
    boolean wood;

    public Ruler() {
        draw = false;
    }

    public void measure() {
        System.out.println("Сейчас померяем длину");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public int getLength() {
        return length;
    }

    public boolean isWood() {
        return wood;
    }
    @Override
    public void display() {
        System.out.println("This is Ruler");
        System.out.printf("Название: %s, Цвет: %s, Длина линейки: %s, ", name, color, length);
        System.out.printf("Из дерева: %s, ", wood ? "Да" : "Нет");
        System.out.printf("Цена: %s, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
}

class Divider extends WritingMaterials {
    String dividerType;
    boolean metal;

    public Divider() {
        draw = true;
    }

    public final void draw_circle() {
        System.out.println("Нарисован круг");
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }
    @Override
    public void display() {
        System.out.println("This is Divider");
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, ", name, color, length);
        System.out.printf("Тип циркуля: %s, ", dividerType);
        System.out.printf("Из металла: %s, ", metal ? "Да" : "Нет");
        System.out.printf("Цена: %s, Умеет рисовать: %s.\n", price, draw ? "Да" : "Нет");
    }
}