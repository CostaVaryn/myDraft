package stepik.javabasics.graphicaluserinterface.graphicsinjava;

import stepik.javabasics.graphicaluserinterface.addingimages.TestFrame;

import javax.swing.*;
public class ContentPaneReplace extends JFrame {
    private static final long serialVersionUID = 1L;

    public ContentPaneReplace() {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание панели с двумя кнопками
        JPanel contents = new JPanel();
        contents.add(new JButton("Семья"));
        contents.add(new JButton("Школа"));
        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(200, 100);
        // Открытие окна
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            ContentPaneReplace frame = new ContentPaneReplace();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}