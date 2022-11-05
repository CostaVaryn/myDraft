package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyComponent extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        try {
            // создаем изображение 100*100 пикселей
            BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            // g=(Graphics2D) img.getGraphics(); // по старому
            g=img.createGraphics(); // по новому
            ((Graphics2D) g).setBackground(Color.magenta);
            g.clearRect(0, 0, 100, 100);
            g.setColor(Color.white);
            ((Graphics2D) g).fill(new Polygon(
                    new int []{10,30,45,50,45, 45,30},
                    new int []{10,10,30,60,80, 40,80},
                    7));
            g.dispose(); // освобождаем ресурсы         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyComponent m = new MyComponent();
        JFrame f = new JFrame("MyComponent");
        f.add(m);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}