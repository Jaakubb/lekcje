package org.example;

import java.io.*;

public class FileService implements FileRead {


    public FileService() throws FileNotFoundException {
    }

    @Override
    public String read(String FileName) throws IOException {
        File file = new File(FileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String ol = "";
        while((line = br.readLine()) != null){
            ol=ol.concat(line);}

        return ol;
    }


}


