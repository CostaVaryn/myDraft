package hardtask.nullobject;

import java.nio.file.Files;
import java.nio.file.Paths;

/*
Null Object Pattern
*/

public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            fileData = new ConcreteFileData(Files.isHidden(Paths.get(pathToFile)), Files.isExecutable(Paths.get(pathToFile)),
                    Files.isDirectory(Paths.get(pathToFile)), Files.isWritable(Paths.get(pathToFile)));
        } catch (Exception ex) {
            fileData = new NullFileData(ex);
        }

    }

    public FileData getFileData() {
        return fileData;
    }
}
