package stepik.javabasics.graphicaluserinterface.animations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;

public class SampleImage extends JFrame {
    public SampleImage() {

        JLabel label = new JLabel(new ImageIcon("src/test/java/stepik/javabasics/graphicaluserinterface/addingimages/astronaut.png"));

        JFrame frame = new JFrame();
        frame.setTitle("Перемещение картинки");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new MyPanel(label));
        frame.setSize(1536, 864);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new SampleImage();
    }
}

class MyPanel extends JPanel implements MouseListener, MouseMotionListener{

    int prevX, prevY;
    JLabel label;

    public MyPanel(JLabel label) {
        this.label = label;
        addMouseMotionListener(this);
        addMouseListener(this);
        add(label);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        prevX = label.getX() - e.getX();
        prevY = label.getY() - e.getY();

        Component c = e.getComponent();
        if(c instanceof JLabel){
            updateLocation(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Component c = e.getComponent();
        if(c instanceof JLabel){
            updateLocation(e);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        updateLocation(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private void updateLocation(MouseEvent e) {
        label.setLocation(prevX + e.getX(), prevY + e.getY());
        repaint();
    }
}
