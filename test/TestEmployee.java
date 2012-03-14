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
    }
    @Test
    public void shouldEmployeeEquals(){
        assertEquals(true , employee1.equalsWith(employee2));
    }
    @Test
    public void shouldGetRightTenner(){
        employee1.setDateOfJob(new Date(1999,2,2));
        assertEquals((2012-1999),employee1.getTenner());
    }

}
