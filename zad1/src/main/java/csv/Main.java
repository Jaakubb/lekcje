package csv;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<BankData> bankDatas = new FileSerwice().getBankDatas();

        for (BankData bankData : bankDatas) {
            System.out.println(bankData);
            
        }

        int wynik = bankDatas.stream()
                .filter(s -> "MO".equals(s.getState()))
                .map(s -> {
                    try {
                        return Integer.parseInt(s.getFund());
                    }
                    catch (NumberFormatException e){
                        return 0;
                    }
                }
                )
                .reduce(0, (integer, integer2) -> {
                    return integer + integer2;
                });
        System.out.println(wynik);



    }
}
