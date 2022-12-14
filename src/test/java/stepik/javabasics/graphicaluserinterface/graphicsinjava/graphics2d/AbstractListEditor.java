package stepik.javabasics.graphicaluserinterface.graphicsinjava.graphics2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class AbstractListEditor implements ListEditor {
    protected int editedCell = -1;

    public void installEditor(final JList list, final Runnable startEdit) {
        // Слушатели, инициирующие редактирование
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount () == 2 && SwingUtilities.isLeftMouseButton(e)) {
                    startEdit.run ();
                }
            }
        });
        list.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode () == KeyEvent.VK_F2) {
                    startEdit.run ();
                }
            }
        });
    }

    public boolean isCellEditable(JList list, int index, Object value) {
        return true;
    }

    public Rectangle getEditorBounds(JList list, int index, Object value, Rectangle cellBounds) {
        // Стандартные размеры редактора идентичные размерам редактируемой ячейки
        return new Rectangle(0, 0, cellBounds.width, cellBounds.height + 1);
    }

    public boolean updateModelValue(JList list, int index, Object value, boolean updateSelection) {
        // Обновление модели при завершении редактирования
        ListModel model = list.getModel();
        if (model instanceof DefaultListModel) {
            ((DefaultListModel)model).setElementAt(value, index);
            list.repaint();
            return true;
        }
        else if (model instanceof AbstractListModel) {
            final Object[] values = new Object[model.getSize()];
            for (int i = 0; i < model.getSize (); i++) {
                if (editedCell != i) {
                    values[i] = model.getElementAt(i);
                }
                else {
                    values[i] = value;
                }
            }
            list.setModel(new AbstractListModel() {
                public int getSize() {
                    return values.length;
                }

                public Object getElementAt(int index) {
                    return values[index];
                }
            });
            return true;
        }
        else {
            return false;
        }
    }

    public void editStarted(JList list, int index) {
        // Сохранение индекса редактирумой ячейки
        editedCell = index;
    }

    public void editFinished(JList list, int index, Object oldValue, Object newValue) {
        // Очистка индекса редактируемой ячейки
        editedCell = -1;
    }

    public void editCancelled(JList list, int index) {
        // Очистка индекса редактируемой ячейки
        editedCell = -1;
    }

    public boolean isEditing() {
        // Проверка активности редактора
        return editedCell != -1;
    }
}