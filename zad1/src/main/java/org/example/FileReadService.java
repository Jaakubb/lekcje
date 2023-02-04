package org.example;

import java.io.IOException;

public class FileReadService {
    public void printfilecontent (FileRead fileRead) throws IOException {
        System.out.println(fileRead.read("C:\\Users\\user\\Desktop\\file.txt"));
    }
}
