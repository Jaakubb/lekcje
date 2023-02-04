package org.example;

public class ExecuteTimeMeasure {
    public long measureTime(Executedservice executeService) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        executeService.execute();

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
