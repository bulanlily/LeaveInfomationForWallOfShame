package leave;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String office;
    private Date dateOfJob;
    private ArrayList<Leave> historyLeaves;



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
        Calendar rightNow =Calendar.getInstance();
        return rightNow.getTime().getYear();
    }

    public int getRightActuralRateByYear() {
        if(Constants.FIRST_STEP>=this.getTenner()){
            return Constants.FIRST_ACTUAL_DAYS_BY_YEAR;
        }else if(Constants.SECOND_STEP>=this.getTenner()){
            return  Constants.SECOND_ACTUAL_DAYS_BY_YEAR;
        }else if(Constants.THIRD_STEP>+this.getTenner()){
            return Constants.THIRD_ACTUAL_DAYS_BY_YEAR;
        }else {
            return Constants.FORTH_ACTUAL_DAYS_BY_YEAR;
        }

    }

    public double getRightActuralRateByMonth() {
        return getRightActuralRateByYear()/Constants.MONTH_IN_A_YEAR;
    }
}
