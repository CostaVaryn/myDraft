package stepik.javabasics.graphicaluserinterface.javaonline;

import javax.swing.*;
import java.awt.event.*;

public class XMLMenuCreatorTest extends JFrame {
    private static final long serialVersionUID = 1L;

    public XMLMenuCreatorTest() {
        super("XML Menu Loader");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        try {
            // открываем файл XML с описанием меню
            XMLReader xmlReader = new XMLReader ("src/test/java/stepik/javabasics/graphicaluserinterface/javaonline/menu.xml", "UTF8");
            // Загружаем меню
            XMLMenuCreator menuCreater = new XMLMenuCreator(xmlReader.getInputSource());
            menuCreater.parse();
            // Подключение строки меню
            setJMenuBar(menuCreater.getMenuBar("mainMenu"));
            // Подключение слушателя
            menuCreater.addActionListener("exit", new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }});
        } catch (Exception e) {
            e.printStackTrace();
        }
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new XMLMenuCreatorTest();
    }
}
