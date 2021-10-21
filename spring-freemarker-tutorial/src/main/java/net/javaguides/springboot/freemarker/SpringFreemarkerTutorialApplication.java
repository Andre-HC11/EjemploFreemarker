package net.javaguides.springboot.freemarker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.freemarker.model.Employee;
import net.javaguides.springboot.freemarker.repository.EmployeeRepository;

@SpringBootApplication
public class SpringFreemarkerTutorialApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFreemarkerTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee("Equipo2", "Sistemas Web", "sisweb@gmail.com"));
		employeeRepository.save(new Employee("Tom", "Cruise", "tom@gmail.com"));
		employeeRepository.save(new Employee("John", "Cena", "john@gmail.com"));
		employeeRepository.save(new Employee("Tony", "Stark", "stark@gmail.com"));
		
	}

}
