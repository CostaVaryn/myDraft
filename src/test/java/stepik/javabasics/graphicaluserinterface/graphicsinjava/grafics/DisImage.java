package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisImage extends Canvas{
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40); // задаем шрифт
        Color newColor = new Color(0, 0, 255, 255); // задаем цвет
        g.setFont(font); // принимаем текущий шрифт
        g.setColor(newColor); // принимаем текущий цвет
        g.drawString("Лайтовые рисунки",100,30); // выводим строку

        g.setColor(Color.RED);
        int[] x = {80,77,74,71,71,74,80,86,89,89,86,83,80};
        int[] y = {13,11,11,14,18,23,29,23,18,14,11,11,13};
        Polygon heart = new Polygon(x, y, 13);
        g.fillPolygon(heart);

        g.setColor(Color.yellow);
        g.fillRect(100,100,50,80);
        g.setColor(Color.orange);
        g.fillRect(100,180,50,20);

        g.setColor(new Color(0xFF5B140A, true));
        int[] xLeft = {100,100,80,80};
        int[] yLeft = {180,220,240,200};
        g.fillPolygon(xLeft,yLeft,4);
        int[] xRight = {150,150,170,170};
        int[] yRight = {180,220,240,200};
        g.fillPolygon(xRight,yRight,4);

        g.setColor(Color.RED);
        int[] xCent = {100,125,150};
        int[] yCent = {100,60,100};
        g.fillPolygon(xCent,yCent,3);

        /*
             Matreshka failed, very small
        g.setColor(Color.BLACK);
        double[] xVal = {-8,-8,-7,-5.5,-5.5,-4.5,-3,-1,1,3,4.5,5.5,5.5,7,8,8,8,7.5,6,5,2,-2,-5,-6,-7.5,-8,-8};
        int[] xValInt = new int[xVal.length];
        double[] yVal = {0,3,5,10,12,14.5,15.5,16.5,16.5,15.5,14.5,12,10,5,3,0,-3,-5,-8,-10,-10.5,10.5,-10,-8,-5,-3,0};
        for(int i = 0; i < xVal.length; i++) {
            xValInt[i] = (int)xVal[i] + ;
        }
        Polygon contur = new Polygon(xVal,yVal,xVal.length);

         */


    }

    public static void main(String[] args) {
        DisImage m = new DisImage();
        JFrame f = new JFrame("Альбом замечательных рисунков");
        f.add(m);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);

        /*
                2 способ центрирования:

        f.setSize(600,600); // размер окна
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);

                3 способ центрирования:

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 800;
        int sizeHeight = 600;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;
        f.setBounds(locationX, locationY, sizeWidth, sizeHeight);
         */

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
