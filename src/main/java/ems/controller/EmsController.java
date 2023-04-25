package ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import ems.dao.EmployeeDao;
import ems.model.Employee;

@Controller
public class EmsController {
	@Autowired
	private EmployeeDao employeeDao;

	// HOME HANDLER
	@RequestMapping("/home")
	public String home(Model m) {
		List<Employee> employees = employeeDao.getAllEmployees();
		m.addAttribute("emp", employees);
		return "home";
	}

	// ADD EMPLOYEE HANDLER
	@RequestMapping("/add-employee")
	public String addEmployee() {
		return "add_employee";
	}

	// handle what do to after clicking on Add button..
	@RequestMapping(value = "/emp-form", method = RequestMethod.POST)
	public RedirectView handleEmployee(@ModelAttribute Employee employee, HttpServletRequest request) {
		System.out.println(employee);
		employeeDao.createEmployee(employee);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/"); // getContextPath() will always return the main/home page
																// url ie:- https://localhost:8080/..so here we are
																// going back to home page after submitting form
		return redirectView;
	}

	// DELETE EMPLOYEE HANDLER
	@RequestMapping("/delete-employee/{eid}")
	public RedirectView deleteEmployee(@PathVariable("eid") int eid, HttpServletRequest request) {
		employeeDao.deleteEmployee(eid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// UPDATE EMPLOYEE HANDLER
	// show update form
	@RequestMapping("/update-employee/{eid}")
	public String updateEmployee(@PathVariable("eid") int eid, Model m) {
		Employee employee = this.employeeDao.getEmployee(eid);
		m.addAttribute("emp", employee);
		return "update_employee";
	}

	// AFTER CLIKING ON UPDATE BUTTON WHAT TO DO...
	@RequestMapping(value = "/update-employee", method = RequestMethod.POST)
	public RedirectView handleEmployeeUpdate(@ModelAttribute Employee employee, HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		System.out.println(employee);
		employeeDao.createEmployee(employee);
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	// AFTER CLIKING ON BACK BUTTON WHAT TO DO...
	@RequestMapping(value = "/back")
	public RedirectView back(HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
