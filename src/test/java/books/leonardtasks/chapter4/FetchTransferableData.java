package books.leonardtasks.chapter4;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class FetchTransferableData {
    public Object fetchTransferableData(String data) throws UnsupportedFlavorException, IOException {
        StringSelection ss = new StringSelection(data);
        DataFlavor[] df = ss.getTransferDataFlavors();
        return ss.getTransferData(df[0]);
    }
}