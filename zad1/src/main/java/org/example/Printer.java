package org.example;

public class Printer implements Executedservice{
    @Override
    public void execute() throws InterruptedException {
        Thread.sleep(1000);

        System.out.println("Drukuję tekst");
    }
}
