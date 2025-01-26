package com.example.ingv.driver.repository;

import com.example.ingv.driver.entity.DriverGPS;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface DriverGPSRepository extends CrudRepository<DriverGPS, UUID> {
    ArrayList<DriverGPS> findAll();
}
