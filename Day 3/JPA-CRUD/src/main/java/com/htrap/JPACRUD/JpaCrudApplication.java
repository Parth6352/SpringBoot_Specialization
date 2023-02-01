package com.htrap.JPACRUD;

import com.htrap.JPACRUD.Model.Employee;
import com.htrap.JPACRUD.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class JpaCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudApplication.class, args);
	}


	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Parth");
		employee.setLastName("Bhatia");
		employee.setEmailId("parth.bhatia@scikey.ai");
		userRepository.saveAndFlush(employee);
	}
}
