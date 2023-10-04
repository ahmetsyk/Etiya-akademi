package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreditCardRequest;

public interface CreditCardService {
    boolean cardPayment(CreditCardRequest creditCardRequest);
}
