package org.example.walker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWalker {
    public static void main(String[] args) throws IOException {
        List<Path> paths = Files.walk(Path.of("D:\\Dasturlash kursi")).toList();

        for (Path path : paths) {
            if (Files.isRegularFile(path)) {
//                System.out.println(path);
            }else if (Files.isDirectory(path)){
                System.out.println("Evil: "+path);
            }
        }
    }
}
