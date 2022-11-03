package stepik.javabasics.graphicaluserinterface.graphicsinjava;

import javax.swing.*;

import java.awt.*;

class Example extends JFrame {
    public static void main(String args[]) {
        GraphicsDemo myGraphicsFrame = new GraphicsDemo();
        myGraphicsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class ShapesPanel extends JPanel {
    ShapesPanel() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.yellow); // Цвет фона желтый
        g.setXORMode(Color.red); // Устанавливаем режим рисования XOR, цвет красный
        g.setColor(Color.green);
        g.fillRect(20, 20, 80, 40); // Фактический цвет - это смешанный цвет: зеленый + желтый = серый
        g.setColor(Color.yellow);
        g.fillRect(60, 20, 80, 40); // Вторая половина желтая + желтая = читать, первая половина желтая + серая
        g.setColor(Color.green);
        g.fillRect(20, 70, 80, 40); // Фактический цвет - это смешанный цвет: зеленый + желтый = серый.
        g.fillRect(60, 70, 80, 40);
        // Первая половина (зеленый + желтый) + серый = цвет фона, вторая половина - зеленый + желтый = серый
        g.setColor(Color.green);
        g.drawLine(80, 100, 180, 200); // Линия зеленая + желтая = серая
        g.drawLine(100, 100, 200, 200); // То же, что и выше
        /* Снова рисуем частично перекрывающуюся линию. Средняя часть исходной линии - серый + серый = цвет фона, а расширенная часть - зеленый + желтый = серый. */
        g.drawLine(140, 140, 220, 220);
        g.setColor(Color.yellow); // Анализируем изменение цвета следующей линии, которая перекрывает предыдущую силу
        g.drawLine(20, 30, 160, 30);
        g.drawLine(20, 75, 160, 75);
    }
}

class GraphicsDemo extends JFrame {
    public GraphicsDemo(){
        this.getContentPane().add(new ShapesPanel());
        setTitle("Демонстрация основного метода рисования");
        setSize(300, 300);
        setVisible(true);
    }
}