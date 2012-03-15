package leave;

import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVProcessor {
    private String fileAddress;

    public CSVProcessor(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public void pickUpLatestFiles() {

    }

    public ArrayList<String[]> getCSVInfo() throws IOException {
        CSVReader reader;
        ArrayList csvinfo = new ArrayList();
        String[] nextLine;
        reader = new CSVReader(new FileReader(fileAddress));
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            csvinfo.add(nextLine);
        }
        return csvinfo;
    }
}
