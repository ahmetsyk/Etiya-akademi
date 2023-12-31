package com.etiya.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMaintenanceResponse {
    private int carId;
    private Date sendDate;
    private Date returnDate;
    private double repairPrice;
}
