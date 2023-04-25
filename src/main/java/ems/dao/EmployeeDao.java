package ems.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import ems.model.Employee;

@Component
/* @Repository */			//Done mein se koi bhi ek use kr skte hai..
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//CREATE
	@Transactional
	public void createEmployee(Employee employee) {
		this.hibernateTemplate.saveOrUpdate(employee);;			// AGR SAME ID HUI TO UPDATE KR DEGA OR AGR ID DATABASE MEIN NHI UI TO CREATE KR DEGA..
	}
	
	
	//READ ALL
	public List<Employee> getAllEmployees(){
		List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	}
	
	//READ SINGLE------------THIS WILL ALSO WORK AS UPDATE IN THIS
	public Employee getEmployee(int eid){
		return this.hibernateTemplate.get(Employee.class, eid);
	}
	
	
	//DELETE
	@Transactional
	public void deleteEmployee(int eid) {
		Employee employee = this.hibernateTemplate.load(Employee.class, eid);
		this.hibernateTemplate.delete(employee);
	}
}
