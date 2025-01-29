package com.example.ingv.driver.controller;

import com.example.ingv.driver.entity.DriverGPS;
import com.example.ingv.driver.service.DriverGPSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.UUID;

@Controller
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

}
