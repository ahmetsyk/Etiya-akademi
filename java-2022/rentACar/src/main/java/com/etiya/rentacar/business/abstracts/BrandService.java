package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreateBrandRequest;
import com.etiya.rentacar.business.responses.GetAllBrandsResponce;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponce> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
