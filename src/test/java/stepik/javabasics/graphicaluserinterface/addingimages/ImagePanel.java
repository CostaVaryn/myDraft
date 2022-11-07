package stepik.javabasics.graphicaluserinterface.addingimages;

import stepik.javabasics.graphicaluserinterface.graphicsinjava.winpanel.MyPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
        setVisible(true);
        setBackground(Color.white);
        setForeground(Color.BLACK);

        ImagePanel imagePanel = new ImagePanel();
        JLabel image = new JLabel(new ImageIcon("astronaut.png"));
        imagePanel.add(image);

    }
}

class GraphImagePanel extends JFrame {
    public GraphImagePanel(){
        this.getContentPane().add(new ImagePanel());
        setTitle("Image");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        GraphImagePanel myGF = new GraphImagePanel();
        myGF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGF.setLocationRelativeTo(null);
    }
}