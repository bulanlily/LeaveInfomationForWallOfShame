package leave;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Employee {


    private int id;
    private String name;
    private String office;
    private DateTime dateOfJob;
    private ArrayList<Leave> historyLeaves;


    public Employee(DateTime dateOfJob, int id, String name, String office) {
        this.dateOfJob = dateOfJob;
        this.id = id;
        this.name = name;
        this.office = office;
        this.historyLeaves = new ArrayList<Leave>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id == employee.id) return true;
        else return false;

    }

    @Override
    public int hashCode() {
        return id;
    }

    public void setDateOfJob(DateTime date) {
        this.dateOfJob = date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getOffice() {
        return office;
    }

    public DateTime getDateOfJob() {
        return dateOfJob;
    }


    public int getTenner() {
        return Constants.getCurrentYear() - dateOfJob.getYear();
    }

    public double getRemainingAnnualLeave() {
        double usedLeave = 0;
        for (Leave leave : historyLeaves) {
            if (leave.isAnnualLeave()) {
                usedLeave += leave.getHours()/Constants.WORK_TIME_A_DAY;
            }
        }
        double availableLeave = (double)getRightActuralRateByYear() / Constants.getDaysOfTheYear() * Constants.getCurrentDayOfYear() -usedLeave;
        return  Math.round(availableLeave*10.0)/10.0;
    }


    public int getRightActuralRateByYear() {
        if (Constants.FIRST_STEP >= this.getTenner()) {
            return Constants.FIRST_ACTUAL_DAYS_BY_YEAR;
        } else if (Constants.SECOND_STEP >= this.getTenner()) {
            return Constants.SECOND_ACTUAL_DAYS_BY_YEAR;
        } else if (Constants.THIRD_STEP > +this.getTenner()) {
            return Constants.THIRD_ACTUAL_DAYS_BY_YEAR;
        } else {
            return Constants.FORTH_ACTUAL_DAYS_BY_YEAR;
        }

    }

    public double getRightActualRateByMonth() {
        return getRightActuralRateByYear() / (double) Constants.MONTH_A_YEAR;
    }

    public int addHistoryLeaves(Leave leave) {
        historyLeaves.add(leave);
        return historyLeaves.size();
    }

    public ArrayList<Leave> getHistoryLeaves() {
        return historyLeaves;
    }
}
