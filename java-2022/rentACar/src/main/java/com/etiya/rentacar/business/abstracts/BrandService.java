package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
