package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        ExecuteTimeMeasure executeTimeMeasure = new ExecuteTimeMeasure();

        Printer printer = new Printer();

        long l = executeTimeMeasure.measureTime(new Executedservice() {
            @Override
            public void execute() throws InterruptedException {
                System.out.println("Drukuje tekst");
            }
        });

        System.out.println(l);

        FileReadService fileReadService= new FileReadService();
        fileReadService.printfilecontent(new FileService());



    }
}