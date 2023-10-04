package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.CreditCardService;
import com.etiya.rentacar.business.requests.CreditCardRequest;

public class CreditCardManager implements CreditCardService{
    @Override
    public boolean cardPayment(CreditCardRequest creditCardRequest) {
        return true;
    }
}
