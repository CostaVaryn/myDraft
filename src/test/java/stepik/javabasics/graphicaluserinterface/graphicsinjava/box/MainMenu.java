package stepik.javabasics.graphicaluserinterface.graphicsinjava.box;

import stepik.javabasics.graphicaluserinterface.graphicsinjava.ShapesPanel;
import stepik.javabasics.graphicaluserinterface.graphicsinjava.winpanel.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class MainMenu {
    JFrame mainMenu;
    JPanel panel;
    JLabel lLog;
    JTextField logText;
    JLabel lPas;
    JPasswordField passwordField;
    JButton btnOk;
    JButton btnCancel;

    public MainMenu() {
        JLabel lLog = new JLabel("LOGIN: ");
        JTextField logText = new JTextField(13);
        JLabel lPas = new JLabel("PASS: ");
        JPasswordField passwordField = new JPasswordField(10);
        JButton btnOk = new JButton("Ok");
        JButton btnCancel = new JButton("Cancel");
        Box one = Box.createHorizontalBox();
        one.add(lLog);
        one.add(logText);
        Box two = Box.createHorizontalBox();
        two.add(lPas);
        two.add(Box.createRigidArea(new Dimension(10, 0)));
        two.add(passwordField);
        Box three = Box.createHorizontalBox();
        three.add(Box.createRigidArea(new Dimension(45, 0)));
        btnOk.setAlignmentX(Component.LEFT_ALIGNMENT);
        three.add(btnOk);
        btnCancel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        three.add(btnCancel);
        Box vert = Box.createVerticalBox();
        vert.add(Box.createRigidArea(new Dimension(0, 200)));
        vert.add(one);
        vert.add(two);
        vert.add(three);
        //JPanel panel = new JPanel(vert.getLayout());
        //JPanel panel = new JPanel();
        //JFrame mainMenu = new JFrame("Main Menu", 490, 550, panel);
    }
}