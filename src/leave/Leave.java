package leave;


import org.joda.time.DateTime;

public class Leave {

    private DateTime leaveDate;
    private String subProj;
    private String task;
    private double hours;

    public Leave(DateTime leaveDate, String subProj, String task, double hours) {
        this.leaveDate = leaveDate;
        this.subProj = subProj;
        this.task = task;
        this.hours = hours;
    }

    public boolean isAnnualLeave(){
        return true?this.subProj.equals("ANNUAL_LV"):false;
    }

    public double getHours() {
        return hours;
    }
}
