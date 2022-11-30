package stepik.javabasics.graphicaluserinterface.javaonline;

import javax.swing.*;

import java.awt.event.*;

public class JMenuBarTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile =
            {{"Файл","Ф","",""},
            {"Открыть","О","O",""},
            {"Сохранить","С","S",""}};
    private  final  String[][]  menuEdit =
            {{"Редактирование","Р","",""},
            {"Вырезать","В","X","src/test/java/stepik/javabasics/graphicaluserinterface/javaonline/cut.png"},
            {"Копировать","К","C","src/test/java/stepik/javabasics/graphicaluserinterface/javaonline/copy.png"}};

    /**
     * Функция создания выпадающего меню
     * @param items описание меню
     * @return JMenu выпадающее меню
     */
    private JMenu createMenuItems(final String[][] items) {
        // Создание выпадающего меню
        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {
            // пункт меню "Открыть"
            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0)); // русская буква
            // установим клавишу быстрого доступа (латинская буква)
            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0),
                    KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0)
                item.setIcon(new ImageIcon(items[i][3]));
            menu.add(item);
        }
        return menu;
    }

    /**
     * Функция создания выпадающего меню с вложенными подпунктами
     * @return
     */
    private JMenu createSubmenus() {
        JMenu text = new JMenu("Текст");
        // и несколько вложенных меню
        JMenu style = new JMenu("Стиль");
        JMenuItem bold = new JMenuItem("Жирный");
        JMenuItem italic = new JMenuItem("Курсив");
        JMenu font = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times");
        font.add(arial); font.add(times);
        // размещаем все в нужном порядке
        style.add(bold);
        style.add(italic);
        style.addSeparator();
        style.add(font);
        text.add(style);
        return text;
    }

    public JMenuBarTest() {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        // создаем строку главного меню
        JMenuBar menuBar = new JMenuBar();
        // Создание меню "Файл"
        menuBar.add(createMenuItems(menuFile));
        // Создание меню "Редактирование"
        menuBar.add(createMenuItems(menuEdit));

        menuBar.add(createSubmenus());

        // JMenuBar использует блочное расположение (заполнитель вполне уместен)
        menuBar.add(Box.createHorizontalGlue());
        // Разместим в строке меню не выпадающее меню, а надпись со значком
        JLabel exit = new JLabel(new ImageIcon("src/test/java/stepik/javabasics/graphicaluserinterface/javaonline/exit.png"));
        exit.setText("Выход");
        exit.setBorder(BorderFactory.createEtchedBorder());
        menuBar.add(exit);

        // поместим меню в наше окно
        setJMenuBar(menuBar);
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);
    }
    //--------------------------------------------------------
    public static void main(String[] args) {
        // Подключение украшений для окон
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JMenuBarTest();
    }

    class ExitFinalAction extends AbstractAction {
        private static final long serialVersionUID = 1L;
        ExitFinalAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}