package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.BrandService;
import com.etiya.rentacar.business.requests.CreateBrandRequest;
import com.etiya.rentacar.business.responses.GetAllBrandsResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponce> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
