package com.miu.cs.cs425.pams;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miu.cs.cs425.pams.service.PatientService;

@SpringBootApplication
public class PAMSApp implements CommandLineRunner {

	private final PatientService patientService;

	// this is better than using @Autowired on the field
	// as it makes the dependency explicit and easier to test
	public PAMSApp(PatientService patientService) {
		this.patientService = patientService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PAMSApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Patients Appointments Booking App");
		patientService.printAllPatients();
	}

}
