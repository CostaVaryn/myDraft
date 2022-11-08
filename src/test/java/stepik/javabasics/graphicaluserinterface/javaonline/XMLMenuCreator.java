package stepik.javabasics.graphicaluserinterface.javaonline;

import org.xml.sax.InputSource;

import javax.swing.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.awt.event.ActionListener;

public class XMLMenuCreator {
    private InputSource source;      // источник данных XML
    private SAXParser parser;      // анализатор XML
    private XMLMenuParser xmlHandler;  // обработчик XML

    /**
     * Конструктор класса создания меню
     *
     * @param source источник данных XML
     */
    public XMLMenuCreator(InputSource source) {
        this.source = source;
        try {
            parser = SAXParserFactory.newInstance().newSAXParser();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        // Создание обработчика XML
        xmlHandler = new XMLMenuParser();
    }

    // Создание системы меню
    public void parse() throws Exception {
        parser.parse(source, xmlHandler);
    }

    /**
     * Функция получения выпадающего меню
     *
     * @param name строка меню
     * @return
     */
    public JMenuBar getMenuBar(String name) {
        return (JMenuBar) xmlHandler.getMenuStorage().get(name);
    }

    // позволяет получить выпадающее меню
    public JMenu getMenu(String name) {
        return (JMenu) xmlHandler.getMenuStorage().get(name);
    }

    // позволяет получить элемент меню
    public JMenuItem getMenuItem(String name) {
        return (JMenuItem) xmlHandler.getMenuStorage().get(name);
    }

    // удобный метод для быстрого добавления слушателя событий
    public void addActionListener(String name, ActionListener listener) {
        getMenuItem(name).addActionListener(listener);
    }
}
