package tg;

public class Week {
    public static void main(String[] args) {
        int week = (int) (Math.random() * 7 + 1);
        String k = week < 6 ? "рабочий день." : "выходной день.";
        System.out.println("Число " + week + ".");
        System.out.println("Сегодня " + k);
    }
}
