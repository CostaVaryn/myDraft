package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisplayGomer extends Canvas{
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40); // задаем шрифт
        Color newColor = new Color(0, 0, 255, 255); // задаем цвет
        g.setFont(font); // принимаем текущий шрифт
        g.setColor(newColor); // принимаем текущий цвет
        g.drawString("Лайтовые рисунки",100,30); // выводим строку

    }
    public static void main(String[] args) {
        DisplayGomer m = new DisplayGomer();
        JFrame f = new JFrame("Simpson");
        f.add(m);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
