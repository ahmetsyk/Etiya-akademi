package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreatePaymentRequest;
import com.etiya.rentacar.business.requests.UpdatePaymentRequest;
import com.etiya.rentacar.business.responses.GetAllPaymentResponse;
import com.etiya.rentacar.business.responses.GetByIdPaymentResponse;

import java.util.List;

public interface PaymentService {
    void add(CreatePaymentRequest createPaymentRequest);
    List<GetAllPaymentResponse> getAll();
    GetByIdPaymentResponse getById(int id);

    void update(UpdatePaymentRequest updatePaymentRequest);

    void delete(int id);
}
