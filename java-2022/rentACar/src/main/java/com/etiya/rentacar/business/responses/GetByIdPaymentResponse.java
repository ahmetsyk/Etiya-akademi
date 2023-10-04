package com.etiya.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdPaymentResponse {

    private Date date;
    private double totalPrice;
    private int rentalId;

}
