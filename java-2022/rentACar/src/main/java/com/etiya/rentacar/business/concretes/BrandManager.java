package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.BrandService;
import com.etiya.rentacar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları yazılır.
        return brandRepository.getAll();
    }
}
