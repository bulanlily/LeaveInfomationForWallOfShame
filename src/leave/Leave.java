package leave;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/14/12
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Leave {
    public Leave(Date beginningDate, Date endingDate) {
        this.beginningDate = beginningDate;
        this.endingDate = endingDate;
    }
    private Date beginningDate;
    private Date endingDate;
    private int leaveDays;

}
