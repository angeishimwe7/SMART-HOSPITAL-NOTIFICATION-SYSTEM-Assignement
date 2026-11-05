package com.example.hospital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${hospital.name:General city hospital}")
    private String hospitalName;

    @Override
    public void sendNotification(String patientId, String message){
        System.out.println("[EMAIL:] " + hospitalName + " -> Patient " + patientId + ": " + message);
    }
}
