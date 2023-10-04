package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.ModelService;
import com.etiya.rentacar.business.requests.CreateModelRequest;
import com.etiya.rentacar.business.requests.UpdateModelRequest;
import com.etiya.rentacar.business.responses.GetAllModelsResponse;
import com.etiya.rentacar.business.responses.GetByIdModelResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping()
    public List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid CreateModelRequest createModelRequest) {
        modelService.add(createModelRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateModelRequest updateModelRequest){
        modelService.update(updateModelRequest);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        this.modelService.delete(id);
    }

    @GetMapping("/{id}")
    public GetByIdModelResponse getById(@PathVariable int id){
        return this.modelService.getById(id);
    }
}
