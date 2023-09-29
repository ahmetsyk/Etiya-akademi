package com.etiya.rentacar.business.abstracts;


import com.etiya.rentacar.business.requests.CreateBrandColorRequest;
import com.etiya.rentacar.business.requests.UpdateBrandColorRequest;
import com.etiya.rentacar.business.responses.GetAllBrandColorResponse;
import com.etiya.rentacar.business.responses.GetByIdBrandColorResponse;

import java.util.List;

public interface BrandColorService {
    List<GetAllBrandColorResponse> getAll();
    GetByIdBrandColorResponse getById(int id);
    void add(CreateBrandColorRequest createBrandColorRequest);
    void update(UpdateBrandColorRequest updateBrandColorRequest);
    void delete(int id);

}
