package com.example.hospital;


import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyNotificationService implements NotificationService{

    @Override
    public void sendNotification(String patientId, String message){
        System.out.println("[EMERGENCY] ICU ALERT for patient " + patientId + ": " + message);
    }
}
