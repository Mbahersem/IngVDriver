package com.example.ingv.driver.service;

import com.example.ingv.driver.entity.DriverGPS;
import com.example.ingv.driver.repository.DriverGPSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class DriverGPSService {
    @Autowired
    private DriverGPSRepository driverGPSRepository;

    public DriverGPS getDriver(UUID idDriver) {
        DriverGPS driverGPS = driverGPSRepository.findById(idDriver).orElse(null);
        return driverGPS;
    }

    public ArrayList<DriverGPS> getAllDrivers() {
        ArrayList<DriverGPS> drivers = new ArrayList<>();
        drivers = driverGPSRepository.findAll();
        return drivers;
    }
}
