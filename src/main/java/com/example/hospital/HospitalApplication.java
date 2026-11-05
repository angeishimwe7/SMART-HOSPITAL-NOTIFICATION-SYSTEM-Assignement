package com.example.hospital;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	CommandLineRunner testNotifications(PatientAlertProcessor processor) {
		return args -> {processor.processRoutineAlert
				("101", "Your appointment is tomorrow at 10 AM.");

			processor.processEmergencyAlert
					("202", "Critical ICU alert: immediate attention required.");
		};
	}
}