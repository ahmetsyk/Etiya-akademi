package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.requests.CreateMaintenanceRequest;
import com.etiya.rentacar.business.requests.UpdateMaintenanceRequest;
import com.etiya.rentacar.business.responses.GetAllMaintenanceResponse;
import com.etiya.rentacar.business.responses.GetByIdMaintenanceResponse;

import java.util.List;

public interface MaintenanceService {
    List<GetAllMaintenanceResponse> getAll();
    GetByIdMaintenanceResponse getById(int id);
    void add(CreateMaintenanceRequest createMaintenanceRequest);
    void update(UpdateMaintenanceRequest updateMaintenanceRequest);
    void delete(int id);
}
