package com.etiya.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRentalRequest {
    private double dailyPrice;
    private int rentedForDays;
    private int carId;
    private Date date;

}
