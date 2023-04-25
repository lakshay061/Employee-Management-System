package ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	private String empName;
	private String empMail;
	private Long empContactNumber;
	
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public Long getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(String empContactNumber) {
		this.empContactNumber = Long.parseLong(empContactNumber);;
	}
	
	
	public Employee(Integer eid, String empName, String empMail, String empContactNumber) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empMail = empMail;
		this.empContactNumber = Long.parseLong(empContactNumber);
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", empMail=" + empMail + ", empContactNumber="
				+ empContactNumber + "]";
	}
	
	
	
	
	
}
