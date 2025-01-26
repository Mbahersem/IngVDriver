package com.example.ingv.driver.controller;

import com.example.ingv.driver.entity.DriverGPS;
import com.example.ingv.driver.service.DriverGPSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class DriverGPSController {
    @Autowired
    private DriverGPSService driverGPSService;

    @QueryMapping
    public ArrayList<DriverGPS> getAllDrivers() {
        return driverGPSService.getAllDrivers();
    }

    @QueryMapping
    public DriverGPS getDriverById(@Argument UUID idDriver) {
        return driverGPSService.getDriver(idDriver);
    }

    @MutationMapping
    public DriverGPS insertData(@Argument UUID idDriver, @Argument float latitude, @Argument float longitude, @Argument float altitude, @Argument float precision, @Argument Date timestamp){
        DriverGPS driverGPS = driverGPSService.insertData(idDriver, latitude, longitude, altitude, precision, timestamp);
        return driverGPS;
    }
}
