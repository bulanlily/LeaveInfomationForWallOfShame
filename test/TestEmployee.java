import org.joda.time.DateTime;
import  org.junit.Assert.*;
import leave.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TestEmployee {
    Employee employee1;
    Employee employee2;
    @Before
    public void setUp(){
        employee1 = new Employee(1);
        employee2 = new Employee(1);
        employee1.setDateOfJob(new DateTime(1999,2,2,0,0));
    }
    @Test
    public void shouldEmployeeEquals(){
        assertEquals(true , employee1.equalsWith(employee2));
    }
    @Test
    public void shouldGetRightTenner(){
        assertEquals((2012-1999),employee1.getTenner());
    }

    @Test
    public void shouldGetRightActualRateByYear(){
        assertEquals(25,employee1.getRightActuralRateByYear());
    }
    @Test
    public void shouldGetRightActualRateByMonth(){
        assertEquals(2.08,employee1.getRightActuralRateByMonth(),0.01);
    }

}
