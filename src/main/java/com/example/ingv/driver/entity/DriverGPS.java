package com.example.ingv.driver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("drvier_gps")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverGPS {
    @PrimaryKey
    private UUID idDriver;
    private float latitude;
    private float longitude;
    private float altitude;
    private float precision;
    private Date timestamp;

}
