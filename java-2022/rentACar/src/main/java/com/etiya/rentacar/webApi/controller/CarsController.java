package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;
import com.etiya.rentacar.business.requests.UpdateModelRequest;
import com.etiya.rentacar.business.responses.GetAllCarResponse;
import com.etiya.rentacar.business.responses.GetByIdCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarsController {
    private CarService carService;

    @GetMapping()
    List<GetAllCarResponse> getAll(){
        return this.carService.getAll();
    }

    @GetMapping("/{id}")
    GetByIdCarResponse getById(@PathVariable int id){
        return this.carService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCarRequest createCarRequest){
        this.carService.add(createCarRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateCarRequest updateCarRequest){
        this.carService.update(updateCarRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.carService.delete(id);
    }
}
