package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSerwice {
    public List<BankData> getBankDatas() throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\banklist.csv"));
        String line = reader.readLine();
        List<BankData> bankDataList = new ArrayList<>();

        boolean isFirst = true;


        while (line != null) {
            if (isFirst) {
                isFirst = false;
                continue;
            }

            line = reader.readLine();

            if (line == null) {
                break;
            }

            String[] split = line.split(",");

            BankData bankdata = new BankData(split[0],
                    split[1],
                    split[2],
                    split[3],
                    split[4],
                    split[5],
                    split[6]);

            bankDataList.add(bankdata);
        }
        reader.close();
        return bankDataList;
    }


}
