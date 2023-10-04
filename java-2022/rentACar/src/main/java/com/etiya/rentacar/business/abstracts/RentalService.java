package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreateRentalRequest;
import com.etiya.rentacar.business.requests.CreditCardRequest;
import com.etiya.rentacar.business.requests.UpdateRentalRequest;
import com.etiya.rentacar.business.responses.GetAllRentalResponse;
import com.etiya.rentacar.business.responses.GetByIdRentalResponse;

import java.util.List;

public interface RentalService {
    List<GetAllRentalResponse> getAll();
    GetByIdRentalResponse getById(int id);
    void add(CreateRentalRequest createRentalRequest);
    void update(UpdateRentalRequest updateRentalRequest);
    void delete(int id);

}
