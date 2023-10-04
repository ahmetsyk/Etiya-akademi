package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.CarColorService;
import com.etiya.rentacar.business.requests.CreateCarColorRequest;
import com.etiya.rentacar.business.requests.UpdateCarColorRequest;
import com.etiya.rentacar.business.responses.GetAllCarColorResponse;
import com.etiya.rentacar.business.responses.GetByIdCarColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorController {
    CarColorService ColorService;

    @GetMapping()
    public List<GetAllCarColorResponse> getAll() {
        return ColorService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCarColorResponse getById(@PathVariable int id) {
        return ColorService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCarColorRequest createBrandColorRequest) {
        ColorService.add(createBrandColorRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateCarColorRequest updateBrandColorRequest){
        ColorService.update(updateBrandColorRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        ColorService.delete(id);
    }
}
