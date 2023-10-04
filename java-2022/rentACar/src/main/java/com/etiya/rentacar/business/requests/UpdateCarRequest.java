package com.etiya.rentacar.business.requests;

import com.etiya.rentacar.core.utilities.enums.States;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

    private String plate;
    private double dailyPrice;
    private int modelYear;
    private States state;
}
