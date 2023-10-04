package com.etiya.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdRentalResponse {
    private int id;

    private int rentedForDays;

    private double dailyPrice;

    private Date date;

    private int carId;

    private boolean paid ;
}
