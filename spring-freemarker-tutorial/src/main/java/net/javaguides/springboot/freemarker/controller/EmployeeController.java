package net.javaguides.springboot.freemarker.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.freemarker.model.Employee;
import net.javaguides.springboot.freemarker.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String index(Model model) {

		return "index";
	}
	
	@GetMapping("/showEmployees")
	public ModelAndView showCities() {
		List<Employee> employees = this.employeeRepository.findAll();
		Map<String, Object> params = new HashMap<>();
		params.put("employees", employees);
		return new ModelAndView("showEmployees", params);
		
	}

}
