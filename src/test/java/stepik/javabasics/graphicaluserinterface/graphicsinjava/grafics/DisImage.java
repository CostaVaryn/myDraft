package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisImage extends Canvas{

    static int xBias = 400; // смещение по оси Х
    static int yBias = 300; // смещение по оси Y

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

        // контур
        g.setColor(Color.BLACK);
        int[] xVal = {-80,-80,-70,-55,-55,-45,-30,-10,10,30,45,55,55,70,80,80,80,75,60,50,20,-20,-50,-60,-75,-80,-80};
        int[] yVal = {0,30,50,100,120,145,155,165,165,155,145,120,100,50,30,0,-30,-50,-80,-100,-105,-105,-100,-80,-50,-30,0};
        for(int i = 0; i < xVal.length; i++) {
            xVal[i] = xVal[i] + xBias;
            yVal[i] = (yVal[i] - yBias) * (-1);
        }
        g.drawPolygon(xVal,yVal,xVal.length);

        // подставка
        int[] xxVal = {55,60,50,30,-30,-50,-60,-55};
        int[] yyVal = {-90,-100,-110,-120,-120,-110,-100,-90};
        for(int i = 0; i < xxVal.length; i++) {
            xxVal[i] = xxVal[i] + xBias;
            yyVal[i] = (yyVal[i] - yBias) * (-1);
        }
        g.drawPolyline(xxVal,yyVal,xxVal.length);

        // окружность лица
        int[] xxxVal = {0,20,30,40,40,30,20,0,-20,-30,-40,-40,-30,-20,0};
        int[] yyyVal = {145,140,130,110,90,75,65,60,65,75,90,110,130,140,145};
        for(int i = 0; i < xxxVal.length; i++) {
            xxxVal[i] = xxxVal[i] + xBias;
            yyyVal[i] = (yyyVal[i] - yBias) * (-1);
        }
        g.drawPolygon(xxxVal,yyyVal,xxxVal.length);

        // волосы/hair
        int[] xHair = {-40,-20,-10,0,10,20,40};
        int[] yHair = {110,115,125,145,125,115,110};
        for(int i = 0; i < xHair.length; i++) {
            xHair[i] = xHair[i] + xBias;
            yHair[i] = (yHair[i] - yBias) * (-1);
        }
        g.drawPolyline(xHair,yHair,xHair.length);

        // глаза/eyes
        int[] xEye1 = {-8,-15,-25,-15,-8};
        int[] xEye2 = {8,15,25,15,8};
        int[] yEye1 = {100,95,100,105,100};
        int[] yEye2 = {100,95,100,105,100};
        for(int i = 0; i < xEye1.length; i++) {
            xEye1[i] = xEye1[i] + xBias;
            xEye2[i] = xEye2[i] + xBias;
            yEye1[i] = (yEye1[i] - yBias) * (-1);
            yEye2[i] = (yEye2[i] - yBias) * (-1);
        }
        g.drawPolyline(xEye1,yEye1,xEye1.length);
        g.drawPolyline(xEye2,yEye2,xEye2.length);

        g.drawLine(15 + xBias,(100 - yBias) * (-1), 15 + xBias,(100 - yBias) * (-1));
        g.drawLine(-15 + xBias,(100 - yBias) * (-1), -15 + xBias,(100 - yBias) * (-1));

        // брови/brows
        g.drawLine(-10 + xBias,(110 - yBias) * (-1), -20 + xBias,(110 - yBias) * (-1));
        g.drawLine(10 + xBias,(110 - yBias) * (-1), 20 + xBias,(110 - yBias) * (-1));

        // носик/spout
        g.drawLine(-3 + xBias,(90 - yBias) * (-1), -3 + xBias,(90 - yBias) * (-1));
        g.drawLine(3 + xBias,(90 - yBias) * (-1), 3 + xBias,(90 - yBias) * (-1));

        // ротик/mouth
        int[] xMouth = {-5,5,0};
        int[] yMouth = {75,75,70};
        for(int i = 0; i < xMouth.length; i++) {
            xMouth[i] = xMouth[i] + xBias;
            yMouth[i] = (yMouth[i] - yBias) * (-1);
        }
        g.drawPolygon(xMouth,yMouth,xMouth.length);

        // outlines
        int[] xOut1 = {-65,-50,-20,0,20,50,65};
        int[] yOut1 = {60,50,40,50,40,50,60};
        for(int i = 0; i < xOut1.length; i++) {
            xOut1[i] = xOut1[i] + xBias;
            yOut1[i] = (yOut1[i] - yBias) * (-1);
        }
        g.drawPolyline(xOut1,yOut1,xOut1.length);

        // руки/hands
        int[] xHand1 = {-70,-60,-50,-50,-35,-10,-10,-20,-40,-75};
        int[] xHand2 = {70,60,50,50,35,10,10,20,40,75};
        int[] yHand1 = {50,40,20,-5,0,-15,-35,-45,-50,-40};
        int[] yHand2 = {50,40,20,-5,0,-15,-35,-45,-50,-40};
        for(int i = 0; i < xHand1.length; i++) {
            xHand1[i] = xHand1[i] + xBias;
            xHand2[i] = xHand2[i] + xBias;
            yHand1[i] = (yHand1[i] - yBias) * (-1);
            yHand2[i] = (yHand2[i] - yBias) * (-1);
        }
        g.drawPolyline(xHand1,yHand1,xHand1.length);
        g.drawPolyline(xHand2,yHand2,xHand2.length);

        // муфточка/clutch
        int[] xClutch1 = {-10,0,10};
        int[] xClutch2 = {-10,0,10};
        int[] yClutch1 = {-15,-10,-15};
        int[] yClutch2 = {-35,-40,-35};
        for(int i = 0; i < xClutch1.length; i++) {
            xClutch1[i] = xClutch1[i] + xBias;
            xClutch2[i] = xClutch2[i] + xBias;
            yClutch1[i] = (yClutch1[i] - yBias) * (-1);
            yClutch2[i] = (yClutch2[i] - yBias) * (-1);
        }
        g.drawPolyline(xClutch1,yClutch1,xClutch1.length);
        g.drawPolyline(xClutch2,yClutch2,xClutch2.length);

        // жилетка и фартучек/vest and apron
        int[] xVest1 = {-50,-20,-20};
        int[] xVest2 = {50,20,20};
        int[] yVest1 = {50,30,-10};
        int[] yVest2 = {50,30,-10};
        for(int i = 0; i < xVest1.length; i++) {
            xVest1[i] = xVest1[i] + xBias;
            xVest2[i] = xVest2[i] + xBias;
            yVest1[i] = (yVest1[i] - yBias) * (-1);
            yVest2[i] = (yVest2[i] - yBias) * (-1);
        }
        g.drawPolyline(xVest1,yVest1,xVest1.length);
        g.drawPolyline(xVest2,yVest2,xVest2.length);
        g.drawLine(-30 + xBias,(-80 - yBias) * (-1), -60 + xBias,(-80 - yBias) * (-1));
        g.drawLine(30 + xBias,(-80 - yBias) * (-1), 30 + xBias,(-80 - yBias) * (-1));

        int[] xApron = {-20,-20,-30,-30,-25,25,30,30,20,20};
        int[] yApron = {-45,-70,-80,-85,-90,-90,-85,-80,-70,-45};
        for(int i = 0; i < xApron.length; i++) {
            xApron[i] = xApron[i] + xBias;
            yApron[i] = (yApron[i] - yBias) * (-1);
        }
        g.drawPolygon(xApron,yApron,xApron.length);
        g.drawLine(-20 + xBias,(20 - yBias) * (-1), 20 + xBias,(20 - yBias) * (-1));
        g.drawLine(-20 + xBias,(10 - yBias) * (-1), 20 + xBias,(10 - yBias) * (-1));

        // бантик/bow
        int[] xBow1 = {-20,-10,0,-5};
        int[] xBow2 = {20,10,0,5};
        int[] yBow1 = {20,40,50,35};
        int[] yBow2 = {20,40,50,35};
        for(int i = 0; i < xBow1.length; i++) {
            xBow1[i] = xBow1[i] + xBias;
            xBow2[i] = xBow2[i] + xBias;
            yBow1[i] = (yBow1[i] - yBias) * (-1);
            yBow2[i] = (yBow2[i] - yBias) * (-1);
        }
        g.drawPolygon(xBow1,yBow1,xBow1.length);
        g.drawPolygon(xBow2,yBow2,xBow2.length);

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
