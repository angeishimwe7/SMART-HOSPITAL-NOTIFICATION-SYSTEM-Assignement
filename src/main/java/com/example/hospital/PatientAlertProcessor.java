package com.example.hospital;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    @Autowired
    private NotificationService defaultNotificationService;

    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyNotificationService;

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET}")
    private String apiSecret;

    public void processRoutineAlert(String patientId, String message) {
        System.out.println("Hospital: " + hospitalName);

        defaultNotificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {
        System.out.println("Hospital: " + hospitalName);

        emergencyNotificationService.sendNotification(patientId, message);
    }
}