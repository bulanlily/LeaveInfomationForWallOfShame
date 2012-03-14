package leave;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVProcessor {
  public ArrayList getCSVInfo(String fileAccess) throws IOException {
      CSVReader reader;
      ArrayList csvinfo = new ArrayList();
      String[] nextLine;
      reader = new CSVReader(new FileReader(fileAccess));
      while ((nextLine=reader.readNext())!= null){
          csvinfo.add(nextLine);
      }
      return csvinfo;
  }
}
