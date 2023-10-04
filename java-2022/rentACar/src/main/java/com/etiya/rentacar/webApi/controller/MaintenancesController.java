package com.etiya.rentacar.webApi.controller;

import com.etiya.rentacar.business.abstracts.MaintenanceService;
import com.etiya.rentacar.business.requests.CreateMaintenanceRequest;
import com.etiya.rentacar.business.requests.UpdateMaintenanceRequest;
import com.etiya.rentacar.business.responses.GetAllMaintenanceResponse;
import com.etiya.rentacar.business.responses.GetByIdMaintenanceResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenances")
@AllArgsConstructor
public class MaintenancesController {
    private MaintenanceService maintenanceService;


    @GetMapping()
    public List<GetAllMaintenanceResponse> getAll(){
        return maintenanceService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdMaintenanceResponse getById(@PathVariable int id){
        return maintenanceService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateMaintenanceRequest createMaintenanceRequest){
        this.maintenanceService.add(createMaintenanceRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateMaintenanceRequest updateMaintenanceRequest){
        this.maintenanceService.update(updateMaintenanceRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.maintenanceService.delete(id);
    }
}
