package com.etiya.rentacar.business.abstracts;


import com.etiya.rentacar.business.requests.CreateCarColorRequest;
import com.etiya.rentacar.business.requests.UpdateCarColorRequest;
import com.etiya.rentacar.business.responses.GetAllCarColorResponse;
import com.etiya.rentacar.business.responses.GetByIdCarColorResponse;

import java.util.List;

public interface CarColorService {
    List<GetAllCarColorResponse> getAll();
    GetByIdCarColorResponse getById(int id);
    void add(CreateCarColorRequest createBrandColorRequest);
    void update(UpdateCarColorRequest updateBrandColorRequest);
    void delete(int id);

}
