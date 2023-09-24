package com.etiya.rentacar.dataAccess.abstracts;

import com.etiya.rentacar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
