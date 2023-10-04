package com.etiya.rentacar.webApi.controller;


import com.etiya.rentacar.business.abstracts.RentalService;
import com.etiya.rentacar.business.requests.CreateRentalRequest;
import com.etiya.rentacar.business.requests.UpdateRentalRequest;
import com.etiya.rentacar.business.responses.GetAllRentalResponse;
import com.etiya.rentacar.business.responses.GetByIdRentalResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/rentals")
public class RentalsController {

    private RentalService rentalService;


    @GetMapping()
    public List<GetAllRentalResponse> getAll() {
        return rentalService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void  add(@RequestBody CreateRentalRequest createRentalRequest){
        rentalService.add(createRentalRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        rentalService.delete(id);
    }

    @PutMapping()
    public  void  update(UpdateRentalRequest updateRentalRequest){
        rentalService.update(updateRentalRequest);
    }

    @GetMapping("/{id}")
    public GetByIdRentalResponse getById(@PathVariable  int id){
        return  rentalService.getById(id);
    }


}
