package stepik.javabasics.graphicaluserinterface.graphicsinjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Oкнo с рамкой");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setBackground(Color.white);
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        //JLabel label = new JLabel(new ImageIcon("src/main/resources/pepe.png"));
        final JLabel label = new JLabel("JUSTICE!");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // MouseListener

        JButton button = new JButton("Click me");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //System.out.println("mouseClicked");
                label.setForeground(Color.red);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println("mousePressed");
                label.setForeground(Color.green);
                label.setText("What do you want?");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //System.out.println("mouseReleased");
                label.setForeground(Color.yellow);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //System.out.println("mouseExited");
            }
        });

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //System.out.println("mouseClicked");
                label.setForeground(Color.red);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println("mousePressed");
                label.setForeground(Color.green);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //System.out.println("mouseReleased");
                label.setForeground(Color.yellow);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //System.out.println("mouseExited");
            }
        });


        frame.add(label);
        frame.add(button);
    }
}
