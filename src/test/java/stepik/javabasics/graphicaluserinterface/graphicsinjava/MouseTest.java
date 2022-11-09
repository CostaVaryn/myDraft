package stepik.javabasics.graphicaluserinterface.graphicsinjava;

import javax.swing.*;
import java.awt.*;

public class MouseTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Oкнo с рамкой");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);

        // MouseListener
        JLabel label = new JLabel()
    }
}
