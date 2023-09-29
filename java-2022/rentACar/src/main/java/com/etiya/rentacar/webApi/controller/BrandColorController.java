package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.BrandColorService;
import com.etiya.rentacar.business.requests.CreateBrandColorRequest;
import com.etiya.rentacar.business.requests.UpdateBrandColorRequest;
import com.etiya.rentacar.business.responses.GetAllBrandColorResponse;
import com.etiya.rentacar.business.responses.GetByIdBrandColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class BrandColorController {
    BrandColorService brandColorService;

    @GetMapping()
    public List<GetAllBrandColorResponse> getAll() {
        return brandColorService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandColorResponse getById(@PathVariable int id) {
        return brandColorService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandColorRequest createBrandColorRequest) {
        brandColorService.add(createBrandColorRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateBrandColorRequest updateBrandColorRequest){
        brandColorService.update(updateBrandColorRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        brandColorService.delete(id);
    }
}
