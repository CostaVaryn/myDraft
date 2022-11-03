package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisImage extends Canvas{
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString("YES", 50, 190);
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40); // задаем шрифт
        g.setFont(font); // принимаем текущий шрифт
        g.drawString("SBP", 270, 220); // выводим строку
        Color newColor = new Color(0, 0, 255, 255); // задаем цвет
        g.setColor(newColor); // принимаем текущий цвет
        g.drawString("SBP", 270, 280);
        g.drawString("YES", 50, 250);
    }

    public static void main(String[] args) {
        DisImage m = new DisImage();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600,600);
        //f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
