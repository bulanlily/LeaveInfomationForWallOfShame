import leave.CSVProcessor;
import leave.Leave;
import leave.TimeSheet;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;


public class IntegrationTest {
    @Test
    public void should_calculate_remaining_days() throws IOException {

        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.pickUpLatestFolder();
        TimeSheet timeSheet = new TimeSheet();
        timeSheet.addAllEmployeeToListByStrings(csvProcessor.getEmployeeInfo());
        timeSheet.addAllLeaveToListByStrings(csvProcessor.getTakeOffInfo());
        assertEquals(4.2, timeSheet.findEmployeeById(12093).getRemainingAnnualLeave(),0.01);
    }
    @Test
    public void should_be_able_to_find_historical_leave() throws IOException {
        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.pickUpLatestFolder();
        TimeSheet timeSheet = new TimeSheet();
        timeSheet.addAllEmployeeToListByStrings(csvProcessor.getEmployeeInfo());
        timeSheet.addAllLeaveToListByStrings(csvProcessor.getTakeOffInfo());
        ArrayList<Leave> leaves = timeSheet.findEmployeeById(12093).getHistoryLeaves();
        assertEquals(15, leaves.size());
    }
}
