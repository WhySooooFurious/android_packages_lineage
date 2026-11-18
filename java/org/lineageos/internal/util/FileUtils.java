package org.lineageos.internal.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static boolean isFileWritable(String path) {
        if (path == null) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.canWrite();
    }

    public static boolean writeLine(String path, String line) {
        if (path == null || line == null) {
            return false;
        }
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(line);
            writer.write("\n");
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
