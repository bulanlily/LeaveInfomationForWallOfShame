package leave;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private String office;
    private DateTime dateOfJob;
    private ArrayList<Leave> historyLeaves;



    public Employee(int id) {
        this.id = id;
    }

    public boolean equalsWith(Employee employee){
        return true?(employee.id==this.id):false;
    }

    public void setDateOfJob(DateTime date) {
        this.dateOfJob = date;
    }

    public int getTenner() {
        return getCurrentYear()-dateOfJob.getYear();
    }
    private  int getCurrentYear(){
        DateTime currentDate = new DateTime();
        return  currentDate.getYear();
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
        return getRightActuralRateByYear()/(double)Constants.MONTH_IN_A_YEAR;
    }
}
