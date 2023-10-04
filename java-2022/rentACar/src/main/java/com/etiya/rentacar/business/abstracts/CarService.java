package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;
import com.etiya.rentacar.business.responses.GetAllCarResponse;
import com.etiya.rentacar.business.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarResponse> getAll();
    GetByIdCarResponse getById(int id);
    void add(CreateCarRequest createCarRequest);
    void update(UpdateCarRequest updateCarRequest);
    void delete(int id);
}
