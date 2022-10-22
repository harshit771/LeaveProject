package infinite.LeaveProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;

import org.junit.jupiter.api.Test;

public class LeaveTest { 
  
	@Test
	
	public void testToString() {
		Leave leave2=new Leave(1, 4, "OK", 1000, Date.valueOf("2022-10-18"), Date.valueOf("2022-10-21"),LeaveStatus.APPROVED,LeaveType.EL,"Fever");
		
	   String result="Leave [leaveId=" + 1 + ", noOfDays=" + 4 + ", mgrCmt=" + "OK" + ", empId=" + 1000
				+ ", leaveStartDate=" + Date.valueOf("2022-10-18") + ", leaveEndDate=" + Date.valueOf("2022-10-21") + ", leaveStatus="
				+ "APPROVED" + ", leaveType=" + "EL" + ", leaveReason=" +   "Fever" +"]";
	  
	   assertEquals(result,leave2.toString());
	}
	
	
	@Test
	public void testGetterSetter() {
		Leave leave=new Leave();
		leave.setLeaveId(1);
		leave.setNoOfDays(4);
		leave.setMgrCmt("OK");
		leave.setEmpId(1000);
		leave.setLeaveStartDate(Date.valueOf("2022-10-18"));
		leave.setLeaveEndDate(Date.valueOf("2022-10-21"));
		leave.setLeaveStatus(LeaveStatus.APPROVED);
		leave.setLeaveType(LeaveType.EL);
		leave.setLeaveReason("Fever");
		
		assertEquals(1,leave.getLeaveId());
		assertEquals(4,leave.getNoOfDays());
		assertEquals("OK",leave.getMgrCmt());
		assertEquals(1000,leave.getEmpId());
		assertEquals(Date.valueOf("2022-10-18"),leave.getLeaveStartDate());
		assertEquals(Date.valueOf("2022-10-21"),leave.getLeaveEndDate());
		assertEquals(LeaveStatus.APPROVED,leave.getLeaveStatus());
		assertEquals(LeaveType.EL,leave.getLeaveType());
		assertEquals("Fever",leave.getLeaveReason());
	}
	
	@Test
	
	public void testConstructor() {
		
		Leave leave1=new Leave();
		assertNotNull(leave1);
		
		Leave leave2=new Leave(1, 4, "OK", 1000, Date.valueOf("2022-10-18"), Date.valueOf("2022-10-21"), LeaveStatus.APPROVED,LeaveType.EL, "Fever");
		assertEquals(1,leave2.getLeaveId());
		assertEquals(4,leave2.getNoOfDays());
		assertEquals("OK",leave2.getMgrCmt());
		assertEquals(1000,leave2.getEmpId());
		assertEquals(Date.valueOf("2022-10-18"),leave2.getLeaveStartDate());
		assertEquals(Date.valueOf("2022-10-21"),leave2.getLeaveEndDate());
		assertEquals(LeaveStatus.APPROVED,leave2.getLeaveStatus());
		assertEquals(LeaveType.EL,leave2.getLeaveType());
		assertEquals("Fever",leave2.getLeaveReason());
	}
}
