# Smart Hospital Notification System

A Spring Boot application demonstrating Spring IoC, dependency injection, and notification service selection.

## Technologies
- Java 21
- Spring Boot
- Spring Framework IoC
- Maven

## Notification Services
- EmailNotificationService: Default notification service using @Primary.
- SmsNotificationService: SMS notification bean.
- EmergencyNotificationService: Emergency notification bean selected using @Qualifier.

## Configuration
The hospital name is configured using hospital.name.

The hospital API secret is read from the HOSPITAL_API_SECRET environment variable.

Do not commit real API secrets. Use .env.example as a configuration template.

## Running the Application
1. Configure HOSPITAL_API_SECRET in your environment or IntelliJ Run Configuration.
2. Open the project in IntelliJ IDEA.
3. Run HospitalApplication.

The application demonstrates routine email notifications and emergency notifications in the console.
