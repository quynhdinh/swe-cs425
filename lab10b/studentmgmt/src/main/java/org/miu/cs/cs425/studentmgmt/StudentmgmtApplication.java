package org.miu.cs.cs425.studentmgmt;

import org.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {

	private final StudentService studentService;
	public StudentmgmtApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentmgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
