package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisGraf extends Canvas {
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        int[] xArray = {20, 40, 60, 80, 100, 120, 130, 140, 280, 332};
        int[] yArray = {390, 360, 340, 310, 290, 280, 275, 273, 271, 269};
        int nPoint = 10;
        Color oldColor = g.getColor();
        Color newColor = new Color(0, 0, 255);
        g.setColor(newColor);
        g.drawPolyline(xArray, yArray, nPoint);
        g.setColor(oldColor);
        g.drawString("y = f(x)", 180, 267);
    }

    public static void main(String[] args) {
        DisGraf m = new DisGraf();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600,600);
        //f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
