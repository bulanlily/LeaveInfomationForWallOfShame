package leave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/14/12
 * Time: 10:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private int id;
    private String name;
    private String office;
    private Date dateOfJob;
    private int tenner;
    private ArrayList<Leave> historyLeaves;
    private double accuralRateByMonth;
    private int accuralRateByYear;



    public Employee(int id) {
        this.id = id;
    }

    public boolean equalsWith(Employee employee){
        return true?(employee.id==this.id):false;
    }

    public void setDateOfJob(Date date) {
        this.dateOfJob = date;
    }

    public int getTenner() {
        return getCurrentYear()-dateOfJob.getYear();
    }
    private  int getCurrentYear(){
        Date date = new Date();
        Calendar rightNow =
        return date.getYear();
    }
}
