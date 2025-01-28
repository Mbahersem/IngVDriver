package com.example.ingv.driver.service;

import com.example.ingv.driver.entity.DriverGPS;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "gps_driver", groupId = "group_id")
    public void consume(String message) {
        System.out.println(message);
    }
}
