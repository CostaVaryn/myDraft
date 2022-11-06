package stepik.javabasics.graphicaluserinterface.graphicsinjava.graphics2d;

import javax.swing.*;
import java.awt.*;

public interface ListEditor {
    void installEditor(JList list, Runnable startEdit);

    boolean isCellEditable(JList list, int index, Object value);

    JComponent createEditor(JList list, int index, Object value);

    Rectangle getEditorBounds(JList list, int index, Object value, Rectangle cellBounds);

    void setupEditorActions(JList list, Object value, Runnable cancelEdit,
                                     Runnable finishEdit);

    Object getEditorValue(JList list, int index, Object oldValue);

    boolean updateModelValue(JList list, int index, Object value, boolean updateSelection);

    void editStarted(JList list, int index);

    void editFinished(JList list, int index, Object oldValue, Object newValue);

    void editCancelled(JList list, int index);
}