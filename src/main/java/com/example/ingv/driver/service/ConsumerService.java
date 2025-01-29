package com.example.ingv.driver.service;

import com.example.ingv.driver.entity.DriverGPS;
import com.example.ingv.driver.repository.DriverGPSRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired
    private DriverGPSRepository driverGPSRepository;

    @KafkaListener(topics = "gps_driver", groupId = "group_id")
    public void consume(String message) {
        System.out.println(message);
        Gson gson = new Gson();
        DriverGPS driverGPS = gson.fromJson(message, DriverGPS.class);
        System.out.println(driverGPS.toString());
        driverGPSRepository.save(driverGPS);
    }
}
