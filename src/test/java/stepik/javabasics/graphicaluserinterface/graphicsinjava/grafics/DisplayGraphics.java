package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas {

    public void paint(Graphics g) {
        g.drawString("Hello",80,60); // строка текста
        setBackground(Color.WHITE); // цвет фона
        g.fillRect(80, 150,80, 60); // прямоугольник с заполнением
        g.fill3DRect(80,250,80,60,false); // прямоугольник как бы 3D
        g.drawOval(200,30,80, 80); // овал без заполнения
        setForeground(Color.BLUE); // цвет фигур и их заполнения
        g.fillOval(200,150,80, 80); // овал с заполнением
        g.drawArc(200, 300, 80,80,0,180); // дуга (arcAngle в градусах)
        g.fillArc(200, 400, 80,80,0,180); // дуга с заполнением
        g.fillRoundRect(360, 30,80,60,40,40);

    }
    public static void main(String[] args) {
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600,600);
        //f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}