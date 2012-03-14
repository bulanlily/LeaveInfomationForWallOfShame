package leave;

import java.util.Date;

public class Leave {

    private Date leaveDate;
    private String subProj;
    private String task;
    private int hours;

    public Leave(Date leaveDate, String subProj, String task, int hours) {
        this.leaveDate = leaveDate;
        this.subProj = subProj;
        this.task = task;
        this.hours = hours;
    }
}
