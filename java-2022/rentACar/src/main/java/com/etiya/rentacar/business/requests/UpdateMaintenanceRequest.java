package com.etiya.rentacar.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMaintenanceRequest {
    @NotNull
    private Date returnDate;
    @NotNull
    private double repairPrice;
    @NotNull
    private int carId;

}
