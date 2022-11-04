package stepik.javabasics.graphicaluserinterface.graphicsinjava.grafics;

import javax.swing.*;
import java.awt.*;

public class DisplayHomer extends Canvas{
    static int xBias = 150;
    static int yBias = 250;
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40); // задаем шрифт
        Color newColor = new Color(191, 0, 255, 255); // задаем цвет
        g.setFont(font); // принимаем текущий шрифт
        g.setColor(newColor); // принимаем текущий цвет
        g.drawString("I'm Homer Jay Simpson",20,30); // выводим строку



        // head
        g.setColor(Color.YELLOW);
        int[] xHead = {50,55,45,30,15,-10,-30,-50,-60,-55,-55,-55,-60,-65,-68,
                        -65,-55,-60,-65,-75,-80,-85,-80,-70,-60,-50,-40,-30,-15,-5,
                        10,25,35,45,55,60,65,75,80,80,85,85,80,85,85,
                        80,75,80,85,90,95,95,95,90,75,75,70,60,55};
        int[] yHead = {-100,-140,-160,-140,-115,-115,-110,-100,-90,-80,-60,-45,-45,-40,-30,
                        -20,-15,0,20,40,60,80,100,115,125,135,140,145,145,145,
                        145,140,130,120,100,90,80,70,60,55,50,30,20,15,5,
                        0,-5,-5,-10,-20,-30,-40,-50,-60,-65,-75,-80,-85,-95};
        for(int i = 0; i < xHead.length; i++) {
            xHead[i] = xHead[i] + xBias;
            yHead[i] = (yHead[i] - yBias) * (-1);
        }
        g.fillPolygon(xHead,yHead,xHead.length);

        // eyes
        g.setColor(Color.WHITE);
        int[] xEyes = {80,65,50,35,25,20,10,0,-20,-30,-35,-25,-15,0,20,30,35,40,50,60,70,80,85,85};
        int[] yEyes = {20,25,20,20,10,5,0,0,5,20,40,55,60,65,60,55,60,65,70,70,65,55,50,30};
        for(int i = 0; i < xEyes.length; i++) {
            xEyes[i] = xEyes[i] + xBias;
            yEyes[i] = (yEyes[i] - yBias) * (-1);
        }
        g.fillPolygon(xEyes,yEyes,xEyes.length);

        // mouth
        g.setColor(new Color(0xA0AD6B0F, true));
        int[] xMouth = {50,40,20,0,-10,-20,-20,-15,-5,10,30,60,75,80,85,90,95,95,95,90,75,75,70,60,55};
        int[] yMouth = {-100,-105,-105,-100,-90,-70,-60,-40,-30,-20,-10,-5,-5,-5,-10,-20,-30,-40,-50,-60,-65,-75,-80,-85,-95};
        for(int i = 0; i < xMouth.length; i++) {
            xMouth[i] = xMouth[i] + xBias;
            yMouth[i] = (yMouth[i] - yBias) * (-1);
        }
        g.fillPolygon(xMouth,yMouth,xMouth.length);

        // hair
        g.setColor(Color.BLACK);


    }
    public static void main(String[] args) {
        DisplayHomer m = new DisplayHomer();
        JFrame f = new JFrame("Simpson");
        f.add(m);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
