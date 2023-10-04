package com.etiya.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllRentalResponse {
    private int id;

    private double dailyPrice;

    private int rentedForDays;

    private Date date;

    private int carId;

    private boolean paid ;

}
