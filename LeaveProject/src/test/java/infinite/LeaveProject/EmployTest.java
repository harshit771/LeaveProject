package infinite.LeaveProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;

import org.junit.jupiter.api.Test;

public class EmployTest {
	@Test 
	public void testToString() {
		Employ employ3 = new Employ(1, "Harshit", "htfr12@gmail.com", "6942069420", Date.valueOf("2022-08-18"), "Java", 1000, 10);
		String result = "Employ [empId=" + 1 + ", Name=" + "Harshit" + ", Email=" + "htfr12@gmail.com" + ", Mob=" + "6942069420" + ", DOJ=" + Date.valueOf("2022-08-18")
				+ ", Dept=" + "Java" + ", mId=" + 1000 + ", leaveAvail=" + 10 + "]";
		assertEquals(result,employ3.toString());
		
	}
	@Test
	public void testGetterAndSetter() {
		Employ employ1 = new Employ();
		employ1.setEmpId(1);
		employ1.setName("Gaurav");
		employ1.setDept("Java");
		employ1.setEmail("gsharma@gmail.com");
		employ1.setMob("8809764532");
		employ1.setDOJ(Date.valueOf("2022-08-18"));
		employ1.setmId(1000);
		employ1.setLeaveAvail(10);
		
		
		assertEquals(1, employ1.getEmpId());
		assertEquals("Gaurav", employ1.getName());
		assertEquals("Java", employ1.getDept());
		assertEquals("gsharma@gmail.com", employ1.getEmail());
		assertEquals("8809764532", employ1.getMob());
		assertEquals(Date.valueOf("2022-08-18"), employ1.getDOJ());
		assertEquals(1000, employ1.getmId());
		assertEquals(10, employ1.getLeaveAvail());
	}
	
	@Test
	public void testConstructor(){
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		
		Employ employ2 = new Employ(1, "Javed Khan", "javed@khan.com", "6942069420", Date.valueOf("2022-08-18"), "Java", 1000, 10);
		assertEquals(1, employ2.getEmpId());
		assertEquals("Javed Khan", employ2.getName());
		assertEquals("javed@khan.com", employ2.getEmail());
		assertEquals("6942069420", employ2.getMob());
		assertEquals(Date.valueOf("2022-08-18"), employ2.getDOJ());
		assertEquals("Java", employ2.getDept());
		assertEquals(1000, employ2.getmId());
		assertEquals(10, employ2.getLeaveAvail()); 
	}
	
	
}
