import leave.CSVProcessor;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CSVProcessorTest {
    String fileAddress;
    ArrayList<String[]> stringsList;
    @Before
    public void setUp(){
        fileAddress ="excels/2012-02/employeeInfo.csv";
        stringsList = new ArrayList<String[]>();
        stringsList.add(new String[]{"1","Beijing","10139","__","Guo","Xiao","Guo,Xiao","1999-07-06"});
        stringsList.add(new String[]{"2","Australia","11192","__","Huang","Liang","Huang,Liang","2005-06-09"});
    }
    @Test
    public void shouldBuildAll() throws IOException {
        CSVProcessor csvProcessor = new CSVProcessor(fileAddress);
        assertArrayEquals(stringsList.get(0), csvProcessor.getCSVInfo().get(0));
        assertArrayEquals(stringsList.get(1),csvProcessor.getCSVInfo().get(1));
    }
}
